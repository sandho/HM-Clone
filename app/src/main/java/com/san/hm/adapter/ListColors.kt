package com.san.hm.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.san.hm.R
import com.san.hm.Utils
import kotlinx.android.synthetic.main.list_color_item.view.*
import kotlinx.android.synthetic.main.list_product_item.view.*

class ListColors(
    private val list: List<Utils.SampleColors>,
    private val context: Context
)  : RecyclerView.Adapter<ProductColorsViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProductColorsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ProductColorsViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: ProductColorsViewHolder, position: Int) {
        val productColorList: Utils.SampleColors = list[position]
        holder.bind(productColorList, context)
    }

    override fun getItemCount(): Int = list.size

}

class ProductColorsViewHolder(inflater: LayoutInflater, parent: ViewGroup) :

    RecyclerView.ViewHolder(inflater.inflate(R.layout.list_color_item, parent, false)) {

    @SuppressLint("ResourceAsColor")
    fun bind(productColorList: Utils.SampleColors, context: Context) {
        itemView.imageViewColor.setBackgroundResource(R.drawable.color_item);
        itemView.imageViewColor.setBackgroundColor(productColorList.color);
    }

}