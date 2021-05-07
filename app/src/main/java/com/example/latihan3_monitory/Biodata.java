package com.example.latihan3_monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/*
    Tanggal Pengerjaan : 06 Mei 2021
    NIM : 10118023
    Nama : Zaenal Anzarry
    Kelas : IF-1/S1/VI
    Deskripsi Pekerjaan : Halaman ini diperuntukkan untuk mengisi biodata yang terdiri dari nama dan
                          dari textfield nama tersebut akan dilempar nilainya ke halaman terakhir
                          jika button selanjutnya ditekan.
 */

public class Biodata extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.app.example.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    public void PindahToHalamanAkhir(View view) {
        Intent intent = new Intent(this, HalamanAkhir.class);
        EditText nama = findViewById(R.id.nama_biodata);
        String message = nama.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }
}