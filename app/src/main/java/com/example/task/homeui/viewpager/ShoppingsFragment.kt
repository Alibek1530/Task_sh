package com.example.task.homeui.viewpager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.task.R
import com.example.task.homeui.shops.AdapterShop
import com.example.task.homeui.shops.ShopsModel


class ShoppingsFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: AdapterShop
    lateinit var shops: ArrayList<ShopsModel>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shoppings, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.shoppinsRecycler)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        saveList()
        adapter = AdapterShop(shops)
        recyclerView.adapter = adapter


    }

    private fun saveList() {
        shops = ArrayList()
        shops.add(ShopsModel("Shops 1", R.drawable.images))
        shops.add(ShopsModel("Shops 2", R.drawable.images))
        shops.add(ShopsModel("Shops 3", R.drawable.images))
        shops.add(ShopsModel("Shops 4", R.drawable.images))
        shops.add(ShopsModel("Shops 5", R.drawable.images))
        shops.add(ShopsModel("Shops 6", R.drawable.images))
        shops.add(ShopsModel("Shops 7", R.drawable.images))
        shops.add(ShopsModel("Shops 8", R.drawable.images))
        shops.add(ShopsModel("Shops 9", R.drawable.images))
        shops.add(ShopsModel("Shops 10", R.drawable.images))
        shops.add(ShopsModel("Shops 11", R.drawable.images))
    }


}