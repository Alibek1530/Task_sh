package com.example.task.homeui.search

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.task.R

class SearchProductActivity : AppCompatActivity() {


    private lateinit var adapter: RVAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var searchView: SearchView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_product)

        searchView = findViewById(R.id.searchchchProduct)

        adapter = RVAdapter(this, addList())
        recyclerView = findViewById(R.id.recyclerViewProduct)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter


        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                adapter.filter.filter(newText)
                return false
            }
        })

    }

    fun addList(): ArrayList<Content> {
        val list = ArrayList<Content>()
        list.add(Content("S21", "S21"))
        list.add(Content("Vivo", "Vivo"))
        list.add(Content("Xiaomi", "Xiaomi"))
        list.add(Content("Samsung", "Samsung"))
        list.add(Content("Oppo", "Oppo"))
        list.add(Content("Realme", "Realme"))
        list.add(Content("Phone12", "Phone12"))
        return list
    }
}