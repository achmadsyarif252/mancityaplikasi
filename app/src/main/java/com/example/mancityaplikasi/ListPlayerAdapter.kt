package com.example.mancityaplikasi

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListPlayerAdapter(val listData: ArrayList<Player>) :
    RecyclerView.Adapter<ListPlayerAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Player)
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.tv_name)
        val tvBio: TextView = itemView.findViewById(R.id.tv_bio)
        val photo: ImageView = itemView.findViewById(R.id.player_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.list_player_item, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val player = listData[position]
        Glide.with(holder.itemView.context)
            .load(player.photo)
            .apply(RequestOptions().override(150, 150))
            .into(holder.photo)

        holder.tvName.text = player.name.toString()
        holder.tvBio.text = player.biodata.toString()

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(player)
        }
    }

    override fun getItemCount(): Int {
        return listData.size
    }
}