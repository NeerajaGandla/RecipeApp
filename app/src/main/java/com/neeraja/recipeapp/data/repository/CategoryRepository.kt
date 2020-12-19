package com.neeraja.recipeapp.data.repository

import com.neeraja.recipeapp.data.remote.ApiHelper
import javax.inject.Inject

class CategoryRepository @Inject constructor(private val apiHelper: ApiHelper) {
    suspend fun getCategories() = apiHelper.getCategories()
}