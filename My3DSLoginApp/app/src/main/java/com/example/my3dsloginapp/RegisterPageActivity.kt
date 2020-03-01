package com.example.my3dsloginapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.Gravity
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import kotlinx.android.synthetic.main.activity_register_page.*

class RegisterPageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_page)

        var myobjfrommain = intent.getSerializableExtra(key) as loginobjxfer
        mymailid2?.text=Editable.Factory.getInstance().newEditable(myobjfrommain.uname.toString())
        mypwdid2.text=Editable.Factory.getInstance().newEditable(myobjfrommain.pwd.toString())

        reg_adduser.setOnClickListener(){
            //verify if the user name pwd is good
            when {
                mypwdid2.text.toString() == mypwdid3.text.toString() -> {
                    Toast.makeText(applicationContext, "Saving / Creating user", LENGTH_LONG)
                        .also { it.setGravity(Gravity.TOP, 0, 0)}.show()
                    // call new activity verify : just a mock to add in database the user
                    startActivity(Intent(this, MockVerifyActLaterMail::class.java))
                }
                else -> {
                    mypwdid3.setTextColor(Color.RED)
                    Toast.makeText(applicationContext, "Password MISMATCH!", LENGTH_LONG)
                        .also { it.setGravity(Gravity.BOTTOM, 0, 0) }.show()
                }
            }

        }

        }
    }

