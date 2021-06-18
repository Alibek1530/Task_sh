package com.example.task.homeui.viewsourc

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.task.R


class ViewAdapter(var list: ArrayList<ViewModel>) : RecyclerView.Adapter<ViewAdapter.MyHolder>() {


    inner class MyHolder(view: View) : RecyclerView.ViewHolder(view) {

        lateinit var imageView: ImageView
        lateinit var textView: TextView

        fun bind(viewModel: ViewModel) {

            imageView = itemView.findViewById(R.id.circleTop)
            textView = itemView.findViewById(R.id.nameTop)

            imageView.setImageResource(viewModel.image)
            textView.text = viewModel.name


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.item_top, parent, false
        )
    )

                override fun onBindViewHolder(holder: MyHolder, position: Int) =
            holder.bind(list[position])

                    override fun getItemCount() = list.size


}