package com.example.uiday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_list_view.*

class ListViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val movies =arrayOf("Don","Deewar","Yarana","Zanjeer","Dostana")
        mylistview.adapter =  ArrayAdapter(this@ListViewActivity,android.R.layout.simple_list_item_1,movies)
        mylistview.onItemClickListener = AdapterView.OnItemClickListener { _, view, position,
                                                                           _ ->Snackbar.make(view,movies[position],Snackbar.LENGTH_INDEFINITE)
            .setAction("OK", View.OnClickListener {  })
            .show()}
    }


}
