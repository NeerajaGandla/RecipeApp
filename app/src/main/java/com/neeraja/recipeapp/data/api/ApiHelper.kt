package com.neeraja.recipeapp.data.api

import com.neeraja.recipeapp.data.model.Category
import retrofit2.Response

interface ApiHelper {
    suspend fun getCategories() : Response<List<Category>>
}