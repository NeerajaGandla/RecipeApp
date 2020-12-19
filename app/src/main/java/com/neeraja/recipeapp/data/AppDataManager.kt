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
        return apiHelper.getCategories()
    }

}