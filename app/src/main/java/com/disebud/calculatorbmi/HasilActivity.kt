package com.disebud.calculatorbmi

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_hasil.*


class HasilActivity : AppCompatActivity() {

    var nama: String? = null
    var hasil:String? = null
    var ket:String? = null
    var bb = 0.0
    var tb = 0.0
    var bmi = 0.0
    var defaultValue = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        //mengambil variabel dari activity lain

        //mengambil variabel dari activity lain
        val intent = intent
        //String pesan = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        //String pesan = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        nama = intent.getStringExtra("EXTRA_NAMA")
        bb = intent.getDoubleExtra("EXTRA_BB", defaultValue)
        tb = intent.getDoubleExtra("EXTRA_TB", defaultValue)
        bmi = intent.getDoubleExtra("EXTRA_BMI", defaultValue)
        hasil = intent.getStringExtra("EXTRA_HASIL")
        ket = intent.getStringExtra("EXTRA_KET")

        text_view_hasil_nama.text = "Nama : "+nama;
        text_view_hasil_bb.text = "Berat Badani : "+bb;
        text_view_hasil_tb.text = "Tinggi Badan : "+tb;
        text_view_hasil_bmi.text = "BMI : "+bmi;
        text_view_hasil.text = "Hasil : "+hasil;
        text_view_hasil_ket.text = "Keterangan : "+ket;


    }


    fun kembaliMain() {
        val intentBack = Intent(this,HitungActivity::class.java)
        startActivity(intentBack)
    }

}