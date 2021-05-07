package com.example.latihan3_monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/*
Tanggal Pengerjaan : 06 Mei 2021
        NIM : 10118023
        Nama : Zaenal Anzarry
        Kelas : IF-1/S1/VI
        Deskripsi Pekerjaan : Halaman ini berisi tampilan awal monitory dan jika kita tekan button
                              mulai maka akan langsung diarahkan ke tampilan login.
*/

public class HalamanAwal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_awal);
    }

    public void PindahToLogin(View view) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}