package com.example.uiday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_handle_fragment.*

class HandleFragment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_handle_fragment)


        frg2.setOnClickListener(){

            //transaction.replace(R.id.fragment_layout_id, fragment)

        }

        looseid.setOnClickListener(){

        }
    }
}
