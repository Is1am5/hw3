package com.example.hw3.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.util.*


class ListAdapters(private var data: ArrayList<String>) : RecyclerView.Adapter<ListAdapters.ListsViewHolder>() {

    inner class ListsViewHolder(private var binding: ItemListBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(position: Int) {
            binding.tvList.text = data[position]
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListsViewHolder {
        return ListsViewHolder(ItemListBinding.inflate(LayoutInflater.from(parent.context) , parent , false))
    }

    override fun onBindViewHolder(holder: ListsViewHolder, position: Int) {
        holder.onBind(position)
    }

    override fun getItemCount(): Int = data.size
}