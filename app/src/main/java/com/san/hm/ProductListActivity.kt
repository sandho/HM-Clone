package com.san.hm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.san.hm.adapter.ListProducts
import kotlinx.android.synthetic.main.activity_product_list.*

class ProductListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_list)

        val adapter = ListProducts(Utils.productListDemo(), this)

        list_products_recycler_view?.layoutManager = GridLayoutManager(this, 2)
        list_products_recycler_view?.adapter = adapter

    }
}