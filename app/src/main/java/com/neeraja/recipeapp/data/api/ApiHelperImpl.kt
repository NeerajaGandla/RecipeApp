package com.neeraja.recipeapp.data.api

import com.neeraja.recipeapp.data.model.CategoriesResponse
import com.neeraja.recipeapp.data.model.Category
import retrofit2.Response
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(private val apiService: ApiService) : ApiHelper {
    override suspend fun getCategories(): Response<CategoriesResponse> = apiService.getCategories()
}