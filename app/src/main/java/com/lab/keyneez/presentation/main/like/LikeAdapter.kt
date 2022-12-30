package com.lab.keyneez.presentation.main.like

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.lab.keyneez.R
import com.lab.keyneez.data.entity.LikeData

class LikeAdapter(private val context: Context) :
    RecyclerView.Adapter<LikeAdapter.ViewHolder>() {
    var data = mutableListOf<LikeData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_like_content, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val imgBackground: ImageView = itemView.findViewById(R.id.iv_like_background)
        private val tvDate: TextView = itemView.findViewById(R.id.tv_like_date)
        private val tvTitle: TextView = itemView.findViewById(R.id.tv_like_title)

        fun bind(item: LikeData) {
            Glide.with(itemView).load(item.background).into(imgBackground)
            tvDate.text = item.date.toString()
            tvTitle.text = item.title
        }
    }
}
