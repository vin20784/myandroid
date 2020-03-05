package com.example.imdbapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MySplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_splash_screen)

        Handler().postDelayed({

            startActivity(Intent(this,MainActivity::class.java))

            // close this activity
            finish()
        }, 3000)
    }
}
