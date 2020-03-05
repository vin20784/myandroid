package com.example.understandingstatemanagement

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    //var visitorcount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //var v = savedInstanceState?.get("visitors") ?: 0
        //visitorcount = v as Int
        //textView.text =visitorcount.toString()


        //var vm= //ViewModelProvider(this,myviewmodel::class.java)
        //ViewModelProvider(this).get(myviewmodel::class.java)
        var vm = ViewModelProviders.of(this).get(myviewmodel::class.java)
        //var vm = ViewModelProvider(this).get(myviewmodel::class.java)
        textView.text =vm.vizcount.toString()

        incr.setOnClickListener(){
            //visitorcount =visitorcount.inc()
            vm.vizcount = vm.vizcount.inc()
            textView.text=vm.vizcount.toString()
        }

        decr.setOnClickListener(){
            //visitorcount =visitorcount.dec()
            vm.vizcount = vm.vizcount.dec()
            textView.text=vm.vizcount.toString()
        }
    }

    /*override fun onSaveInstanceState(outState: Bundle) {

        super.onSaveInstanceState(outState)
        outState.putInt("visitors", visitorcount)
        println()

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {

        super.onRestoreInstanceState(savedInstanceState)
        visitorcount=savedInstanceState.getInt("visitors")
    }*/
}
