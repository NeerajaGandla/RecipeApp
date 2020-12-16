package com.neeraja.recipeapp.data.model

import com.squareup.moshi.Json

data class Category(
    @Json(name = "idCategory")
    val id: String,
    @Json(name = "strCategory")
    val categoryName: String,
    @Json(name = "strCategoryThumb")
    val thumbnail: String,
    @Json(name = "strCategoryDescription")
    val description: String
)