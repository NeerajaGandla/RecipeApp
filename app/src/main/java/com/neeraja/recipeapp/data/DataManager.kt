package com.neeraja.recipeapp.data

import com.neeraja.recipeapp.data.model.api.CategoriesResponse
import retrofit2.Response

interface DataManager {
    suspend fun getCategories() : Response<CategoriesResponse>
}