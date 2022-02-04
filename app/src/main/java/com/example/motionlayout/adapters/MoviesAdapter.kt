package com.example.motionlayout.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.motionlayout.databinding.ItemsMovieBinding
import com.example.motionlayout.models.Movie

class MoviesAdapter constructor(private val items : MutableList<Movie>) :
RecyclerView.Adapter<MoviesAdapter.ViewHolder>(){
    private lateinit var binding : ItemsMovieBinding
    private lateinit var context : Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        context = parent.context
        binding = ItemsMovieBinding.inflate(inflater , parent , false)
        return  ViewHolder(binding)
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

    inner class ViewHolder (itemsBinding : ItemsMovieBinding ) : RecyclerView.ViewHolder(itemsBinding.root){
        fun bind (movie : Movie){
            binding.apply{
                rowIndex.text = movie.id.toString()
                rowTitle.text = movie.title
                rowPic.setImageResource(movie.poster)
            }
        }
    }
}