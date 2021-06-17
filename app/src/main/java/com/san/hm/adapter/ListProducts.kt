package com.san.hm.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.san.hm.R
import com.san.hm.Utils
import kotlinx.android.synthetic.main.activity_product_list.*
import kotlinx.android.synthetic.main.list_product_item.view.*

class ListProducts(
    private val list: List<Utils.ProductList>,
    private val context: Context
)  : RecyclerView.Adapter<ProductListViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProductListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ProductListViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: ProductListViewHolder, position: Int) {
        val productList: Utils.ProductList = list[position]
        holder.bind(productList, context)
    }

    override fun getItemCount(): Int = list.size

}

class ProductListViewHolder(inflater: LayoutInflater, parent: ViewGroup) :

    RecyclerView.ViewHolder(inflater.inflate(R.layout.list_product_item, parent, false)) {

    @SuppressLint("ResourceAsColor")
    fun bind(productList: Utils.ProductList, context: Context) {
        itemView.product_name_txt.text = productList.product_name

        val adapter = ListColors(Utils.productColorList(), context)

        itemView.productColorsRecyclerView?.layoutManager = GridLayoutManager(context, 3)
        itemView.productColorsRecyclerView?.adapter = adapter

    }

}