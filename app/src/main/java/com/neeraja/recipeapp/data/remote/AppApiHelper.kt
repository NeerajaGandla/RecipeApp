package com.neeraja.recipeapp.data.remote

import com.neeraja.recipeapp.data.model.api.CategoriesResponse
import com.neeraja.recipeapp.data.model.api.MealsResponse
import com.neeraja.recipeapp.data.model.api.RecipeResponse
import retrofit2.Response
import javax.inject.Inject

class AppApiHelper @Inject constructor(private val apiService: ApiService) : ApiHelper {
    override suspend fun getCategories(): Response<CategoriesResponse> = apiService.getCategories()
    override suspend fun getMealsByCategory(category: String): Response<MealsResponse> {
        return apiService.getMealsByCategory(category)
    }

    override suspend fun getRecipeDetails(idMeal: String): Response<RecipeResponse> {
        return apiService.getRecipeDetails(idMeal)
    }
}