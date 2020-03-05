package com.example.imdbapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

        val dataList = ArrayList<MovieModel>()
        dataList.add(MovieModel("Matrix ", 1999,"Wachowskis",4.8,R.drawable.matrix))
        dataList.add(MovieModel("Matrix Reloaded", 2003,"Wachowskis", 4.3,R.drawable.matrixreloaded))
        dataList.add(MovieModel("Matrix Revolution", 2003 ,"Wachowskis",4.1,R.drawable.matrixrev))
        dataList.add(MovieModel("Matrix 4", 2021 ,"Lana Wachowski",0.0,R.drawable.matrix4))
        dataList.add(MovieModel("Wall-E", 2008, "Andrew Stanton" ,4.2,R.drawable.walle))
        dataList.add(MovieModel("The Dark Knight", 2008, "Christopher Nolan" ,4.2,R.drawable.darknight))
        dataList.add(MovieModel("Inception", 2010, "Christopher Nolan" ,4.4,R.drawable.inception))

        //        pass the values to RvAdapter
        val rvAdapter = RcViewAdapter(this,dataList)
//        set the recyclerView to the adapter
        recyclerView.adapter = rvAdapter;

    }
}
