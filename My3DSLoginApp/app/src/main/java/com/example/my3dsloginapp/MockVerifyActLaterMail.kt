package com.example.my3dsloginapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_mock_verify_act_later_mail.*

class MockVerifyActLaterMail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mock_verify_act_later_mail)
        button_verify.setOnClickListener()
        {
            Toast.makeText(applicationContext, "Account VERIFIED!! welcome to Medidata ", Toast.LENGTH_LONG)
                .also { it.setGravity(Gravity.CENTER, 0, 0) }.show()

            //startActivity(Intent(this, WelcomeScreenLandingactivity::class.java))

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.medidata.com/en/"))
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }
    }
}
