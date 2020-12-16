package com.neeraja.recipeapp.data.api

import com.neeraja.recipeapp.data.model.Category
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("categories.php")
    suspend fun getCategories(): Response<List<Category>>
}