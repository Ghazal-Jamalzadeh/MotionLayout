package com.example.motionlayout.project.home.images

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.motionlayout.databinding.ItemImagesPostsBinding

class ImagesAdapter constructor(private val items: MutableList<ImagesModel>) : RecyclerView.Adapter<ImagesAdapter.ViewHolder>() {

    private lateinit var binding: ItemImagesPostsBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        binding = ItemImagesPostsBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size

    inner class ViewHolder(itemView: ItemImagesPostsBinding) : RecyclerView.ViewHolder(itemView.root) {

        fun bind(item: ImagesModel) {
            binding.itemInstaPostsImg.setImageResource(item.img)
        }
    }
}