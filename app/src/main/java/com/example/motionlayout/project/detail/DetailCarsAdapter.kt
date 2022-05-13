package com.example.motionlayout.project.detail

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.motionlayout.databinding.ItemDetailCarBinding
import com.example.motionlayout.project.home.cars.CarsModel

class DetailCarsAdapter constructor(private val items: MutableList<CarsModel>) :
    RecyclerView.Adapter<DetailCarsAdapter.ViewHolder>() {

    private lateinit var binding: ItemDetailCarBinding
    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        context = parent.context
        binding = ItemDetailCarBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    inner class ViewHolder(itemView: ItemDetailCarBinding) : RecyclerView.ViewHolder(itemView.root) {

        @SuppressLint("SetTextI18n")
        fun bind(item: CarsModel) {
            binding.itemCarImg.setImageResource(item.img)
            binding.itemCarName.text = item.name
            binding.itemCarPrice.text = "$${item.price}"
        }
    }
}