package com.example.latihan3_monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/*
Tanggal Pengerjaan : 06 Mei 2021
        NIM : 10118023
        Nama : Zaenal Anzarry
        Kelas : IF-1/S1/VI
        Deskripsi Pekerjaan : Halaman ini berisi konfirmasi bahwa kamu telah selesai masuk ke halaman
                              dan disini pula ada text nama yang diambil dari textfield nama pada
                              halaman biodata.
*/

public class HalamanAkhir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_akhir);

        //get data intent
        Intent intent = getIntent();
        String pesan = intent.getStringExtra(Biodata.EXTRA_MESSAGE);

        //set text
        TextView teks2 = findViewById(R.id.teks2_halaman_akhir);
        teks2.setText(pesan);
        TextView teks6 = findViewById(R.id.teks6_halaman_akhir);
        teks6.setText(pesan);
    }
}