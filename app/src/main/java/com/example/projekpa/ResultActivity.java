package com.example.projekpa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.FileNotFoundException;

public class ResultActivity extends AppCompatActivity {

//    TextView akurasi;
    TextView bunga;
    TextView ilmiah;
    TextView mediaTanam;
    TextView penempatan;
    TextView perawatan;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

//        akurasi = findViewById(R.id.akurasi_result);
        image = findViewById(R.id.bunga_image);
        bunga = findViewById(R.id.bunga_result);
        ilmiah = findViewById(R.id.ilmiah_result);
        mediaTanam = findViewById(R.id.media_tanam_result);
        penempatan = findViewById(R.id.penempatan_result);
        perawatan = findViewById(R.id.perawatan_result);


        Database Database = new Database();
        String imageUriString;

        Intent intent = getIntent();
        int pos = intent.getIntExtra("pos",20);
//        float acc = intent.getFloatExtra("acc",0);
        String imageUriStringCam = intent.getStringExtra("img Camera");
        String imageUriStringGal = intent.getStringExtra("img Gallery");

        if(imageUriStringCam == null){
            imageUriString = imageUriStringGal;
        }else {
            imageUriString = imageUriStringCam;
        }

        Uri imageUri = Uri.parse(imageUriString);

        String[] nama = Database.nama;
        String[] namaIlmiah = Database.ilmiah;
        String[] media = Database.mediaTanam;
        String[] tempat = Database.penempatan;
        String[] rawat = Database.perawatan;

        Bitmap originalBitmap;
        try {
            originalBitmap = BitmapFactory.decodeStream(getContentResolver().openInputStream(imageUri));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int dimension = Math.min(originalBitmap.getWidth(), originalBitmap.getHeight());
        // Create a matrix and set the rotation angle
        Matrix matrix = new Matrix();
        matrix.postRotate(90);

// Create the rotated bitmap
        Bitmap rotatedBitmap;
        Bitmap resizedBitmap;

        if(imageUriStringCam == null){
            resizedBitmap = ThumbnailUtils.extractThumbnail(originalBitmap, dimension, dimension);
        }else {
            rotatedBitmap = Bitmap.createBitmap(originalBitmap, 0, 0, originalBitmap.getWidth(), originalBitmap.getHeight(), matrix, true);
            resizedBitmap = ThumbnailUtils.extractThumbnail(rotatedBitmap, dimension, dimension);
        }


        image.setImageBitmap(resizedBitmap);
        bunga.setText(nama[pos]);
        ilmiah.setText(namaIlmiah[pos]);
        mediaTanam.setText(media[pos]);
        penempatan.setText(tempat[pos]);
        perawatan.setText(rawat[pos]);

    }
    @Override
    public void onBackPressed() {
        // Reset or nullify your data here
        image = null;

        super.onBackPressed();
    }

}