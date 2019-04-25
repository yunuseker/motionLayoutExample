package com.yunuseker.motionlayoutexample.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.yunuseker.motionlayoutexample.R

class RecyclerAdapter(val context: Context) : RecyclerView.Adapter<NameViewHolder>() {

    private val list= listOf(
            "Fikri",
            "Deli Emin",
            "Nazmi",
            "Sezgin",
            "Casım",
            "Veli",
            "Basri",
            "Latif",
            "Şeyhmuz",
            "Sezgin",
            "Casım",
            "Veli",
            "Basri",
            "Latif",
            "Şeyhmuz",
            "Mela Hüseyin")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
        return NameViewHolder(LayoutInflater.from(context).inflate(R.layout.item_name, parent, false))
    }

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}

class NameViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private var textView: TextView? = null

    init {
        textView = view.findViewById(R.id.tv_name)
    }

    fun bind(name: String) {
        textView?.text = name
    }
}