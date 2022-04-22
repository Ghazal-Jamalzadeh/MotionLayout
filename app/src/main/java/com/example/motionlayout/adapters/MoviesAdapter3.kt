package com.example.motionlayout.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.motionlayout.databinding.ItemMovie3dBinding
import com.example.motionlayout.models.MoviesModel

class MoviesAdapter3 constructor(private val items: MutableList<MoviesModel>) :
    RecyclerView.Adapter<MoviesAdapter3.ViewHolder>() {

    private lateinit var binding: ItemMovie3dBinding
    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        context = parent.context
        binding = ItemMovie3dBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    inner class ViewHolder(itemBinding: ItemMovie3dBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(item: MoviesModel) {
            binding.apply {
                itemMovie3DTxt.text = item.title
                itemMovie3DImg.setImageResource(item.poster)
            }
        }
    }
}