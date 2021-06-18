package com.example.task.homeui.viewpager

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.task.R
import com.example.task.homeui.card.CardAdapter
import com.example.task.homeui.card.CardModel
import com.example.task.homeui.detals.DetalsActivity
import com.example.task.homeui.product.ProductAdapter
import com.example.task.homeui.product.ProductModel
import com.example.task.homeui.product.setOnClickListener
import com.example.task.homeui.topplayer.TopAdapter
import com.example.task.homeui.topplayer.TopModel


class ProductsFragment : Fragment(), setOnClickListener {
    lateinit var recyclerView: RecyclerView
    lateinit var recyclerView2: RecyclerView
    lateinit var recyclerView3: RecyclerView
    lateinit var adapter: ProductAdapter
    lateinit var adapter1: CardAdapter
    lateinit var adapter2: TopAdapter
    lateinit var list: ArrayList<ProductModel>
    lateinit var list1: ArrayList<CardModel>
    lateinit var list3: ArrayList<TopModel>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_products, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.my_recycler1)
        recyclerView2 = view.findViewById(R.id.my_recycler2)
        recyclerView3 = view.findViewById(R.id.my_recycler3)

        saveList()
        saveList1()
        saveList2()


        recyclerView.layoutManager =
            LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
        adapter = ProductAdapter(list, this)
        recyclerView.adapter = adapter

        recyclerView2.layoutManager =
            LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
        adapter1 = CardAdapter(list1)
        recyclerView2.adapter = adapter1

        recyclerView3.layoutManager =
            LinearLayoutManager(requireContext())
        adapter2 = TopAdapter(list3)
        recyclerView3.adapter = adapter2


    }

    private fun saveList2() {
        list3 = ArrayList()
        list3.add(TopModel(R.drawable.phone, "Samsung"))
        list3.add(TopModel(R.drawable.images, "Apple"))
        list3.add(TopModel(R.drawable.images, "Samsung"))
        list3.add(TopModel(R.drawable.images, "Huave"))
        list3.add(TopModel(R.drawable.images, "Apple"))
        list3.add(TopModel(R.drawable.images, "Poco"))
        list3.add(TopModel(R.drawable.images, "Infinix"))
        list3.add(TopModel(R.drawable.images, "Not"))
    }

    private fun saveList1() {
        list1 = ArrayList()
        list1.add(CardModel("Telefon", R.drawable.phone))
        list1.add(CardModel("Quloqchin", R.drawable.phone))
        list1.add(CardModel("Zaryadlagich", R.drawable.phone))
        list1.add(CardModel("Blutuz", R.drawable.phone))
        list1.add(CardModel("Steklo", R.drawable.phone))
        list1.add(CardModel("Kompyuter", R.drawable.phone))
    }

    private fun saveList() {
        list = ArrayList()
        list.add(ProductModel("Shop1 ", R.drawable.images))
        list.add(ProductModel("Shop 2 ", R.drawable.images))
        list.add(ProductModel("Shop 3 ", R.drawable.images))
        list.add(ProductModel("Shop 4 ", R.drawable.images))
        list.add(ProductModel("Shop 5 ", R.drawable.images))
        list.add(ProductModel("Shop  6 ", R.drawable.images))
        list.add(ProductModel("Shop 7 ", R.drawable.images))
        list.add(ProductModel("Shop 8 ", R.drawable.images))
        list.add(ProductModel("Shop1 9 ", R.drawable.images))
        list.add(ProductModel("Shop 10 ", R.drawable.images))
        list.add(ProductModel("Shop 11 ", R.drawable.images))
    }

    override fun onClick(productModel: ProductModel, id: Int) {

        Log.i("SSSSS", "onClick: ${productModel.name}")

        val intent = Intent(requireContext(), DetalsActivity::class.java)
        intent.putExtra("name", productModel.name)
        intent.putExtra("image", productModel.image.toString())
        startActivity(intent)


    }


}