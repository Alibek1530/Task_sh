package com.example.task.homeui.product

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.task.R

class ProductAdapter(var product: ArrayList<ProductModel>, var onClick: setOnClickListener) :
    RecyclerView.Adapter<ProductAdapter.MyViewHolder>() {


    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        lateinit var textView: TextView
        lateinit var imageView: ImageView

        fun bindDate(productModel: ProductModel, action: setOnClickListener) {

            textView = itemView.findViewById(R.id.text_product)
            imageView = itemView.findViewById(R.id.image_product)

            textView.text = productModel.name
            imageView.setImageResource(productModel.image)

            itemView.setOnClickListener {
                action.onClick(productModel, adapterPosition)

            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_product, parent, false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindDate(product[position], onClick)
    }

    override fun getItemCount() = product.size

}


interface setOnClickListener {

    fun onClick(productModel: ProductModel, id: Int)

}