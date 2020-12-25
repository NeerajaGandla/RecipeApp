package com.neeraja.recipeapp.data.local

import com.neeraja.recipeapp.data.model.db.Category
import javax.inject.Inject

class AppDbHelper @Inject constructor(private val appDatabase: AppDatabase) : DbHelper {
    override suspend fun getCategories(): List<Category> {
        return appDatabase.categoriesDao().loadAll()
    }

    override suspend fun saveCategories(categories: List<Category>) {
        appDatabase.categoriesDao().insertAll(categories)
    }

}