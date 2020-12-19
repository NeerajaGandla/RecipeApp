package com.neeraja.recipeapp.data.model.api

import com.neeraja.recipeapp.data.model.db.Category
import com.squareup.moshi.Json

data class CategoriesResponse (@Json(name = "categories")val categories: List<Category>)