package com.neeraja.recipeapp.data.remote

import com.neeraja.recipeapp.data.model.api.CategoriesResponse
import retrofit2.Response

interface ApiHelper {
    suspend fun getCategories() : Response<CategoriesResponse>
}