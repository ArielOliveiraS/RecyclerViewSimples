package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_recycler_view.view.*

class ItemAdapter(var itemList: MutableList<String>): RecyclerView.Adapter<ItemAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler_view, parent, false);
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itemList[position]
        holder.onBind(item)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun onBind(item: String) {
            itemView.textView.text = item
        }
    }
}