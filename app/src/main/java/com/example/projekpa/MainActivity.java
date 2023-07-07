package com.example.projekpa;

import android.Manifest;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;

import com.example.projekpa.ml.Model;

import org.tensorflow.lite.DataType;
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {

    Button camera, gallery;
    int imageSize = 256;
    Uri imagePassCam;
    Uri imagePassGal;
    File imageFile;
    Uri datUri;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        camera = findViewById(R.id.button);
        gallery = findViewById(R.id.button2);



        if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
            camera.setOnClickListener(view -> {
                Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                imageFile = createImageFile();
                if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
                    datUri = FileProvider.getUriForFile(MainActivity.this, "com.example.projekpa.fileprovider", imageFile);
                    takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, datUri);
                    startActivityForResult(takePictureIntent, 1);
                    }
            });
        } else {
            // Permission is not granted, request it
            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 3);
        }
        gallery.setOnClickListener(view -> {
        Intent galleryIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            startActivityForResult(galleryIntent, 2);
        });
    }


    private File createImageFile() {

        // Get the directory to store the image file
        File storageDir = MainActivity.this.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        try {
            return File.createTempFile(
                    "IMG_${timeStamp}_",
                    ".jpg",
                    storageDir
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void classifyImage(Bitmap image){
        try {
            Model model = Model.newInstance(getApplicationContext());
            // Creates inputs for reference.
            TensorBuffer inputFeature0 = TensorBuffer.createFixedSize(new int[]{1, 256, 256, 3}, DataType.FLOAT32);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(4 * imageSize * imageSize * 3);
            byteBuffer.order(ByteOrder.nativeOrder());

            int[] intValues = new int[imageSize * imageSize];
            image.getPixels(intValues, 0, image.getWidth(), 0, 0, image.getWidth(), image.getHeight());
            int pixel = 0;
            //iterate over each pixel and extract R, G, and B values. Add those values individually to the byte buffer.
            for(int i = 0; i < imageSize; i ++){
                for(int j = 0; j < imageSize; j++){
                    int val = intValues[pixel++]; // RGB
                    byteBuffer.putFloat(((val >> 16) & 0xFF) * (1.f / 255.f));
                    byteBuffer.putFloat(((val >> 8) & 0xFF) * (1.f / 255.f));
                    byteBuffer.putFloat((val & 0xFF) * (1.f / 255.f));
                }
            }

            inputFeature0.loadBuffer(byteBuffer);

            // Runs model inference and gets result.
            Model.Outputs outputs = model.process(inputFeature0);
            TensorBuffer outputFeature0 = outputs.getOutputFeature0AsTensorBuffer();

            float[] confidences = outputFeature0.getFloatArray();
            // find the index of the class with the biggest confidence.
            int maxPos = 0;
            float maxConfidence = 0;
            for (int i = 0; i < confidences.length; i++) {
                if (confidences[i] > maxConfidence) {
                    maxConfidence = confidences[i];
                    maxPos = i;
                }
            }


            Intent intent = new Intent(getApplicationContext(), ResultActivity.class);


            if(maxConfidence < 0.98){
                showDialog();

                // Releases model resources if no longer used.
                model.close();
            }else {
                intent.putExtra("pos", maxPos);
                intent.putExtra("acc",maxConfidence);

                if(imagePassGal == null){
                    intent.putExtra("img Camera", imagePassCam.toString());
                }else {
                    intent.putExtra("img Gallery", imagePassGal.toString());
                }

                imagePassGal = null;
                imagePassCam = null;


                // Releases model resources if no longer used.
                model.close();

                startActivity(intent);
            }

        } catch (IOException e) {
            // TODO Handle the exception
        }
    }

    void showDialog() {
        final Dialog dialog = new Dialog(MainActivity.this);

        dialog.setContentView(R.layout.dialog_box);
        dialog.show();

        Button kembali = dialog.findViewById(R.id.button_kembali);

        kembali.setOnClickListener(view -> dialog.dismiss());

    }

    public Bitmap getBitmapFromUri(Uri uri) {
        try {
            InputStream inputStream = getContentResolver().openInputStream(uri);
            return BitmapFactory.decodeStream(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void cropImage() {
        Intent cropIntent = new Intent("com.android.camera.action.CROP");

        cropIntent.setDataAndType(datUri, "image/*");
        cropIntent.putExtra("crop", true);
        cropIntent.putExtra("scaleUpIfNeeded", true);
        cropIntent.putExtra("return-data", true);
        startActivityForResult(cropIntent, 3);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {


        if(resultCode == RESULT_OK){
            if(requestCode == 1){
                imagePassCam = datUri;
                Bitmap image = getBitmapFromUri(datUri);
                if (image != null) {
                    image = ThumbnailUtils.extractThumbnail(image, imageSize, imageSize);
                    image = Bitmap.createScaledBitmap(image, imageSize, imageSize, false);
                    classifyImage(image);
                }
            }else if(requestCode == 2){
                datUri = data.getData();
                cropImage();

            }else {

                Bundle bundle = data.getExtras();
                Bitmap image = bundle.getParcelable("data");

                imagePassGal = datUri;

                image = ThumbnailUtils.extractThumbnail(image, imageSize, imageSize);
                image = Bitmap.createScaledBitmap(image, imageSize, imageSize, false);
                classifyImage(image);
            }

        }
        super.onActivityResult(requestCode, resultCode, data);
    }

}