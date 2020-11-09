package com.disebud.calculatorbmi

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity


class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        supportActionBar!!.hide()


        //menghilangkan ActionBar
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);


        //menghilangkan ActionBar
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        val handler = Handler()
        handler.postDelayed(Runnable {
            startActivity(Intent(applicationContext, MainActivity::class.java))
            finish()
        }, 3000L) //3000 L = 3 detik

    }
}