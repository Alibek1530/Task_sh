package com.example.task.homeui.viewsourc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.task.R
import com.example.task.homeui.topplayer.TopAdapter
import com.example.task.homeui.topplayer.TopModel

class ViewActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var list: ArrayList<ViewModel>
    lateinit var adapter: ViewAdapter
    lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        recyclerView = findViewById(R.id.recycViewSourc)
        imageView = findViewById(R.id.bbb)

        imageView.setOnClickListener {
            onBackPressed()
        }

        val name = intent.getStringExtra("name1")


        list = ArrayList()

            list.add(ViewModel(R.drawable.images, name.toString()))


        adapter = ViewAdapter(list)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter


    }

}