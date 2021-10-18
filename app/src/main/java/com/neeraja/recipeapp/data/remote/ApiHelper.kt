package com.neeraja.recipeapp.data.remote

import com.neeraja.recipeapp.data.model.api.CategoriesResponse
import com.neeraja.recipeapp.data.model.api.MealsResponse
import retrofit2.Response

interface ApiHelper {
    suspend fun getCategories() : Response<CategoriesResponse>
    suspend fun getMealsByCategory(category: String) : Response<MealsResponse>
}