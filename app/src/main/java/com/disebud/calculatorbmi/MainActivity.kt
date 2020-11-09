package com.disebud.calculatorbmi

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //method onclick, View view sebagai paramater
    fun tentang() {
        Toast.makeText(this,"Ini Layout Tentang \n  Didik Setya Budi", Toast.LENGTH_SHORT).show()
    }

    fun hitung() {
        val intent = Intent(this@MainActivity, HitungActivity::class.java)
        startActivity(intent)
    }
}