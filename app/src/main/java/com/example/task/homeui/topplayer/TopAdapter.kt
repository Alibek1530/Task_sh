package com.example.task.homeui.topplayer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.task.R

class TopAdapter(var list: ArrayList<TopModel>) : RecyclerView.Adapter<TopAdapter.MyTopHolder>() {


    inner class MyTopHolder(view: View) : RecyclerView.ViewHolder(view) {

        lateinit var imageView: ImageView
        lateinit var textView: TextView

        fun bind(topModel: TopModel) {

            imageView = itemView.findViewById(R.id.circleTop)
            textView = itemView.findViewById(R.id.nameTop)

            imageView.setImageResource(topModel.image)
            textView.text = topModel.name


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyTopHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.item_top, parent, false
        )
    )

    override fun onBindViewHolder(holder: MyTopHolder, position: Int) = holder.bind(list[position])

    override fun getItemCount() = list.size

}