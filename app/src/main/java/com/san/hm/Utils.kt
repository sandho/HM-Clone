package com.san.hm

class Utils {

    companion object {

        var HOME_PAGE_IMG = "https://www2.hm.com/content/dam/kids_s03/april_2021/4123e/4123E-1x1-Kids-everyday-essentials.jpg"

        fun productListDemo(): ArrayList<ProductList> {
            val products: ArrayList<ProductList> = ArrayList()

            products.add(ProductList("Product 01"))
            products.add(ProductList("Product 02"))
            products.add(ProductList("Product 03"))
            products.add(ProductList("Product 04"))
            products.add(ProductList("Product 05"))
            products.add(ProductList("Product 06"))
            products.add(ProductList("Product 07"))
            products.add(ProductList("Product 08"))
            products.add(ProductList("Product 09"))
            products.add(ProductList("Product 10"))
            return products
        }

        fun productColorList(): ArrayList<SampleColors> {
            val colors: ArrayList<SampleColors> = ArrayList()

            colors.add(SampleColors(R.color.purple_500))
            colors.add(SampleColors(R.color.light_yellow))
            colors.add(SampleColors(R.color.teal_200))

            return colors
        }

    }

    data class Products(
        var products: List<ProductList>
    )

    data class ProductList(
        var product_name: String,
    )

    data class SampleColors(
        var color: Int
    )


}