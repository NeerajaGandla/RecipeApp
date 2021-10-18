package com.neeraja.recipeapp.data

import com.neeraja.recipeapp.data.local.DbHelper
import com.neeraja.recipeapp.data.model.api.CategoriesResponse
import com.neeraja.recipeapp.data.model.api.MealsResponse
import com.neeraja.recipeapp.data.remote.ApiHelper
import retrofit2.Response
import javax.inject.Inject

class AppDataManager @Inject constructor(
    private val apiHelper: ApiHelper,
    private val dbHelper: DbHelper
) : DataManager {
    override suspend fun getCategories(): Response<CategoriesResponse> {
        val cachedCategories = dbHelper.getCategories()
        if (!cachedCategories.isNullOrEmpty()) {
            return Response.success(CategoriesResponse(cachedCategories))
        }
        val apiResponse = apiHelper.getCategories()
        if (apiResponse.isSuccessful) {
            dbHelper.saveCategories((apiResponse.body() as CategoriesResponse).categories)
        } else {
            return Response.error(apiResponse.errorBody(), null)
        }
        return Response.success(CategoriesResponse(dbHelper.getCategories()))
    }

    override suspend fun getMealsByCategory(category: String): Response<MealsResponse> {
        val cachedMeals = dbHelper.getMealsByCategory(category)
        if (!cachedMeals.isNullOrEmpty()) {
            return Response.success(MealsResponse(cachedMeals))
        }

        val apiResponse = apiHelper.getMealsByCategory(category)
        if (apiResponse.isSuccessful) {
            var mealsData = (apiResponse.body() as MealsResponse).meals.toMutableList()
            dbHelper.saveMealsByCategory(mealsData, category)
        } else {
            return Response.error(apiResponse.errorBody(), null)
        }
        return Response.success(MealsResponse(dbHelper.getMealsByCategory(category)))
    }
}
