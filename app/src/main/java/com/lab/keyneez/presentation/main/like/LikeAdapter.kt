package com.lab.keyneez.presentation.main.like

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.lab.keyneez.data.entity.LikeData
import com.lab.keyneez.databinding.ItemLikeContentBinding

class LikeAdapter : RecyclerView.Adapter<LikeAdapter.getViewHolder>() {
    var data = listOf<LikeData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): getViewHolder {
        val binding =
            ItemLikeContentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return getViewHolder(binding)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: getViewHolder, position: Int) {
        holder.bind(data[position])
    }

    class getViewHolder(private val binding: ItemLikeContentBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: LikeData) {
            Glide.with(itemView).load(item.background).into(binding.ivLikeBackground)
            binding.tvLikeDate.text = item.date
            binding.tvLikeTitle.text = item.title
        }
    }
}
