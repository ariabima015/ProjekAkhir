package com.example.projekpa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView akurasi;
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

        akurasi = findViewById(R.id.akurasi_result);
        image = findViewById(R.id.bunga_image);
        bunga = findViewById(R.id.bunga_result);
        ilmiah = findViewById(R.id.ilmiah_result);
        mediaTanam = findViewById(R.id.media_tanam_result);
        penempatan = findViewById(R.id.penempatan_result);
        perawatan = findViewById(R.id.perawatan_result);


        Database Database = new Database();

        Intent intent = getIntent();
        int pos = intent.getIntExtra("pos",20);
        float acc = intent.getFloatExtra("acc",0);
        byte[] byteArray = intent.getByteArrayExtra("img");
        Bitmap imageBitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);

        String[] nama = Database.indonesia;
        String[] namaIlmiah = Database.ilmiah;
        String[] media = Database.mediaTanam;
        String[] tempat = Database.penempatan;
        String[] rawat = Database.perawatan;
        String akurat = String.valueOf(acc);

        akurasi.setText(akurat);
        image.setImageBitmap(imageBitmap);
        bunga.setText(nama[pos]);
        ilmiah.setText(namaIlmiah[pos]);
        mediaTanam.setText(media[pos]);
        penempatan.setText(tempat[pos]);
        perawatan.setText(rawat[pos]);

    }
}