package com.example.uiday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import kotlinx.android.synthetic.main.activity_color_toast.*
import kotlinx.android.synthetic.main.activity_option_menu.view.*
import kotlinx.android.synthetic.main.color_toast.*
import kotlinx.android.synthetic.main.color_toast.view.*

class ColorToastActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_toast)
        val newlayout = layoutInflater.inflate(R.layout.color_toast,mycolorfultoast)


        send_msg_button.setOnClickListener(){

            val myToast = Toast(this)
            myToast.duration=LENGTH_LONG
            myToast.setGravity(Gravity.TOP, 0, 0)
            newlayout.msgtext.text=myeditText.text.toString()
            myToast.view = newlayout
            myToast.show()

        }
    }
}
