package com.example.task.homeui.shops

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.task.R
import de.hdodenhof.circleimageview.CircleImageView

class AdapterShop(var shops: ArrayList<ShopsModel>) :
    RecyclerView.Adapter<AdapterShop.MySearchHolder>() {


    inner class MySearchHolder(view: View) : RecyclerView.ViewHolder(view) {

        lateinit var textView: TextView
        lateinit var circleImageView: CircleImageView

        fun bindData(shopsModel: ShopsModel) {

            textView = itemView.findViewById(R.id.nameShop)
            circleImageView = itemView.findViewById(R.id.cicrleShop)

            textView.text = shopsModel.name
            circleImageView.setImageResource(shopsModel.image)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MySearchHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_shopping, parent, false)
    )

    override fun onBindViewHolder(holder: MySearchHolder, position: Int) =
        holder.bindData(shops[position])

    override fun getItemCount() = shops.size


}