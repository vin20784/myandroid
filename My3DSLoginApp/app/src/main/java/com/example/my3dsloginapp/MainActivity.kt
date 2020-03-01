package com.example.my3dsloginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

const val key ="myobjkey"
class MainActivity : AppCompatActivity() {

    //companion object
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        reg_id.setOnClickListener {
            var dobj= loginobjxfer(mymailid.text.toString(),mypwdid.text.toString())
            startActivity(Intent(this, RegisterPageActivity::class.java).putExtra(key,dobj))
        }
    }
}
