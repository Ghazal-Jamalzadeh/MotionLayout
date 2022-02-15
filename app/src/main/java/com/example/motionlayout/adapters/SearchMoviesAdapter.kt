package com.example.motionlayout.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.motionlayout.databinding.ItemMovieLightBinding
import com.example.motionlayout.models.MoviesModel

class SearchMoviesAdapter  constructor(private val items: MutableList<MoviesModel>) :
    RecyclerView.Adapter<SearchMoviesAdapter.ViewHolder>() {

    private lateinit var binding: ItemMovieLightBinding
    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        context = parent.context
        binding = ItemMovieLightBinding.inflate(inflater, parent, false)
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

    inner class ViewHolder(itemBinding: ItemMovieLightBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(item: MoviesModel) {
            binding.apply {
                itemMoviesRow.text = item.id.toString()
                itemMoviesName.text = item.title
                itemMoviesImg.setImageResource(item.poster)
            }
        }
    }
}