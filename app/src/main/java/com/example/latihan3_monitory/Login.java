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
        Deskripsi Pekerjaan : Halaman ini berisi tampilan memasukkan kode keluarga dan jika sudah
                              memiliki dan jika tidak memiliki maka bisa membelinya dengan menekan
                              button beli kode keluarga disini tapi untuk fitur ini masih belum
                              disediakan, lalu ada button masuk untuk diarahkan langsung ketampilan
                              halaman akhir.
*/

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void PindahToBiodata(View view) {
        Intent intent = new Intent(this, Biodata.class);
        startActivity(intent);
    }
}