package com.example.databinding

import androidx.lifecycle.MutableLiveData

class Visitor {

    //var counter : Int =5
    //var counterText : String = counter.toString()
    var counter = MutableLiveData<Int>()
    var counterText = MutableLiveData<String>()
    var myeditText = MutableLiveData<String>()

    init {
        counter.value = 0
        counterText.value = counter.value.toString()
        myeditText.value= myeditText.value+counterText.value
    }

    fun Increment(){
        counter.value = counter.value!!.inc()
        counterText.value = counter.value.toString()
        myeditText.value= myeditText.value+counterText.value

        println(counterText.value)
    }
    fun Decrement(){
        counter.value = counter.value!!.dec()
        counterText.value = counter.value.toString()
        myeditText.value= myeditText.value+counterText.value
        println(counterText.value)
    }

}