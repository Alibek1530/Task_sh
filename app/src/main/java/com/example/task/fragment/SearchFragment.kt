package com.example.task.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.Toolbar
import com.example.task.R
import com.example.task.homeui.search.SearchProductActivity
import com.example.task.homeui.search.SearchShopActivity


class SearchFragment : Fragment() {

    lateinit var toolbar: Toolbar
    lateinit var button: AppCompatButton
    lateinit var button1: AppCompatButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        toolbar = view.findViewById(R.id.toolbarSearch)
        toolbar.title = "Search"


        button = view.findViewById(R.id.searchShop)
        button1 = view.findViewById(R.id.searchProduct)

        button.setOnClickListener {

            val intent = Intent(requireContext(), SearchShopActivity::class.java)
            startActivity(intent)

        }

        button1.setOnClickListener {

            val intent = Intent(requireContext(), SearchProductActivity::class.java)
            startActivity(intent)

        }

    }


}