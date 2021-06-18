package com.example.task.homeui.search

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.inputmethod.EditorInfo
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.task.R
import androidx.appcompat.widget.SearchView

class SearchShopActivity : AppCompatActivity() {

    private lateinit var adapter: RVAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var searchView: SearchView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_shop)

        searchView = findViewById(R.id.searchchch)

        adapter = RVAdapter(this, addList())
        recyclerView = findViewById(R.id.recyclerView)
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
        list.add(Content("Lenovo shop", "Lenovo"))
        list.add(Content("Vivo shop", "Vivo"))
        list.add(Content("Xiaomi shop", "Xiaomi"))
        list.add(Content("Samsung shop", "Samsung"))
        list.add(Content("Oppo shop", "Oppo"))
        list.add(Content("Realme shop", "Realme"))
        list.add(Content("Asus shop", "Asus"))
        return list
    }
}