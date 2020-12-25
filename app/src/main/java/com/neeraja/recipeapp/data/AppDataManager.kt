package com.neeraja.recipeapp.data

import com.neeraja.recipeapp.data.local.DbHelper
import com.neeraja.recipeapp.data.model.api.CategoriesResponse
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
}
