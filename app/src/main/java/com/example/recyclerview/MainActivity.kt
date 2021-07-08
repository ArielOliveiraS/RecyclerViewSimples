package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val list = mutableListOf("Item1", "Item2", "Item3", "Item4", "Item5", "Item6", "Item7", "Item8")

    val adapter = ItemAdapter(list)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager( this, LinearLayoutManager.HORIZONTAL, false)
    }
}