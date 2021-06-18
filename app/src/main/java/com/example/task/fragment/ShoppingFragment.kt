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
import com.example.task.homeui.viewsourc.ViewActivity


class ShoppingFragment : Fragment() {

    lateinit var toolbar: Toolbar
    lateinit var button: AppCompatButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shopping, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        toolbar = view.findViewById(R.id.toolbarShopping)
        toolbar.title = "Shopping"

        button = view.findViewById(R.id.viewSours)

        button.setOnClickListener {

            val intent = Intent(requireContext(), ViewActivity::class.java)
            startActivity(intent)
        }

    }


}