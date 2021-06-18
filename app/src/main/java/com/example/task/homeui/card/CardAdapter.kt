package com.example.task.homeui.card

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.task.R

class CardAdapter(var card: ArrayList<CardModel>) :
    RecyclerView.Adapter<CardAdapter.MyCardHolder>() {


    inner class MyCardHolder(view: View) : RecyclerView.ViewHolder(view) {

        lateinit var textView: TextView
        lateinit var imageView: ImageView

        fun bindDat(cardModel: CardModel) {

            textView = itemView.findViewById(R.id.textCard)
            imageView = itemView.findViewById(R.id.imageCard)

            textView.text = cardModel.name
            imageView.setImageResource(cardModel.image)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        MyCardHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_card, parent, false))

    override fun onBindViewHolder(holder: MyCardHolder, position: Int) =
        holder.bindDat(card[position])

    override fun getItemCount() = card.size

}