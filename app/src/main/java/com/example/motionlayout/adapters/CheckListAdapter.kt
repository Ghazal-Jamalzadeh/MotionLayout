package com.example.motionlayout.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.motionlayout.databinding.ItemCheckListBinding
import com.example.motionlayout.models.MoviesModel

class CheckListAdapter constructor(private val items: MutableList<MoviesModel>) :
    RecyclerView.Adapter<CheckListAdapter.ViewHolder>() {

    private lateinit var binding: ItemCheckListBinding
    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        context = parent.context
        binding = ItemCheckListBinding.inflate(inflater, parent, false)
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

    inner class ViewHolder(itemBinding: ItemCheckListBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(item: MoviesModel) {
            binding.apply {
                itemTaskRow.text = item.id.toString()
                itemTaskName.text = item.title
                itemTaskImg.setImageResource(item.poster)
                //Check
                itemCheckImg.setOnClickListener {
                    itemMotion.transitionToStart()
                }
                //Delete
                itemDeleteImg.setOnClickListener {
                    removeAt(adapterPosition)
                }
            }
        }
    }

    fun removeAt(position: Int) {
        items.removeAt(position)
        notifyItemRemoved(position)
        notifyItemRangeChanged(position, items.size)
    }
}