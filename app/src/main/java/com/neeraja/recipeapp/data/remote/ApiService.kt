package com.neeraja.recipeapp.data.remote

import com.neeraja.recipeapp.data.model.api.CategoriesResponse
import com.neeraja.recipeapp.data.model.api.MealsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("categories.php")
    suspend fun getCategories(): Response<CategoriesResponse>

    @GET("filter.php")
    suspend fun getMealsByCategory(@Query("c") category: String): Response<MealsResponse>
}