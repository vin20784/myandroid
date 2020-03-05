package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import com.example.databinding.databinding.ActivityMainBinding




class MainActivity : AppCompatActivity() {

    //lateinit var visitors: Visitor old model minding way
    private lateinit var vmobj : MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main) old method
        //visitors = Visitor() direct model bionding
        // we prefer the VM way of binding so we create VM obj
        vmobj = ViewModelProvider(this).get(MyViewModel::class.java)
        var bindObj =DataBindingUtil.setContentView<ActivityMainBinding>(
            this,
            R.layout.activity_main
        )

        bindObj.lifecycleOwner = this
        //bindObj.xvisitors = visitors old way
        bindObj.xvisitors = vmobj


    }


}
