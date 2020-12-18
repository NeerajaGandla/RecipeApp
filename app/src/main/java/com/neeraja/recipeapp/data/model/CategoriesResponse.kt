package com.neeraja.recipeapp.data.model

import com.neeraja.recipeapp.data.model.Category
import com.squareup.moshi.Json

data class CategoriesResponse (@Json(name = "categories")val categories: List<Category>)