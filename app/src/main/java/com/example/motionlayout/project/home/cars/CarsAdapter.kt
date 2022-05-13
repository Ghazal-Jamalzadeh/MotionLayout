package com.example.motionlayout.project.home.cars

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.motionlayout.databinding.ItemRentCarsBinding
import com.example.motionlayout.project.detail.ProjectDetailActivity
import com.example.motionlayout.project.other.CAR_IMG
import com.example.motionlayout.project.other.CAR_NAME
import com.example.motionlayout.project.other.CAR_PRICE

class CarsAdapter constructor(private val items: MutableList<CarsModel>) : RecyclerView.Adapter<CarsAdapter.ViewHolder>() {

    private lateinit var binding: ItemRentCarsBinding
    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        binding = ItemRentCarsBinding.inflate(inflater, parent, false)
        context = parent.context
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size

    inner class ViewHolder(itemView: ItemRentCarsBinding) : RecyclerView.ViewHolder(itemView.root) {

        fun bind(item: CarsModel) {
            binding.apply {
                itemCarsImg.setImageResource(item.img)
                itemCarName.text = item.name
                itemCarPrice.text = item.price.toString()

                root.setOnClickListener {
                    val intent = Intent(context, ProjectDetailActivity::class.java)
                    intent.putExtra(CAR_IMG, item.img)
                    intent.putExtra(CAR_NAME, item.name)
                    intent.putExtra(CAR_PRICE, item.price)
                    context.startActivity(intent)
                }
            }
        }
    }
}