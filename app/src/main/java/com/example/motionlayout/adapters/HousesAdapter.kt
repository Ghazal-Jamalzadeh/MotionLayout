package com.example.motionlayout.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.motionlayout.R
import com.example.motionlayout.models.HouseModel

class HouseAdapter constructor(private val items: MutableList<HouseModel>) :
    RecyclerView.Adapter<HouseAdapter.ViewHolder>() {

    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        context = parent.context
        return ViewHolder(inflater.inflate(R.layout.item_houses, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    override fun getItemViewType(position: Int): Int {
        return position
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val image = itemView.findViewById<ImageView>(R.id.itemHouse_img)
        private val title = itemView.findViewById<TextView>(R.id.itemHouse_title)
        private val description = itemView.findViewById<TextView>(R.id.itemHouse_description)

        @SuppressLint("SetTextI18n")
        fun bind(item: HouseModel) {
            image.setImageResource(item.imgId)
            title.text = item.title
            description.text = item.description
        }
    }
}