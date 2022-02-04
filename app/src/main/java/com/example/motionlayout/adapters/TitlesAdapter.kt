package com.example.motionlayout.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.motionlayout.activities.MainActivity
import com.example.motionlayout.activities.MoviesActivity
import com.example.motionlayout.databinding.ItemsTitleBinding
import com.example.motionlayout.models.Title

class TitlesAdapter constructor(private val items: MutableList<Title>) :
    RecyclerView.Adapter<TitlesAdapter.ViewHolder>() {
    private lateinit var binding: ItemsTitleBinding
    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        context = parent.context
        binding = ItemsTitleBinding.inflate(inflater, parent, false)
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

    inner class ViewHolder(itemsBinding: ItemsTitleBinding) :
        RecyclerView.ViewHolder(itemsBinding.root) {
        fun bind(title: Title) {
            binding.apply {

                index.text = title.id.toString()
                titleTv.text = title.title
                itemView.setOnClickListener {
                    if (title.id.equals(7)) {
                        val intent = Intent(context, MainActivity::class.java)
//                        intent.putExtra("keyIdentifier", value)
                        context.startActivity(intent)

                    } else if (title.id.equals(9)) {
                        val intent = Intent(context, MoviesActivity::class.java)
//                        intent.putExtra("keyIdentifier", value)
                        context.startActivity(intent)

                    }
                }
            }


        }
    }
}