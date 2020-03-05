package com.example.uiday

import android.app.Dialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_snack_bar.*

class SnackBarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snack_bar)

        button2.setOnClickListener(){
            //Snackbar.make(it,"nashta ready hain !",Snackbar.LENGTH_INDEFINITE).setAction("OK", View.OnClickListener {  }).show()

            AlertDialog.Builder(this)
                .apply {
                    setMessage("kuch to message !")
                    setTitle("Kya AAP closeup karte hain ?")
                    setPositiveButton("YES"){
                            _,
                            _ ->Toast.makeText(applicationContext, "GOOD", Toast.LENGTH_LONG).show()
                }}.create().show()
        }
    }

}
