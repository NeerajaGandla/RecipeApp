package com.neeraja.recipeapp.data.local

import com.neeraja.recipeapp.data.model.db.Category
import com.neeraja.recipeapp.data.model.db.Meal
import javax.inject.Inject

class AppDbHelper @Inject constructor(val appDatabase: AppDatabase) : DbHelper {
    override suspend fun getCategories(): List<Category> {
        return appDatabase.categoriesDao().loadAll()
    }

    override suspend fun saveCategories(categories: List<Category>) {
        appDatabase.categoriesDao().insertAll(categories)
    }

    override suspend fun getMealsByCategory(category: String): List<Meal> {
        return appDatabase.mealsDao().loadAll(category)
    }

    override suspend fun saveMealsByCategory(meals: MutableList<Meal>, category: String) {
        var _meals : MutableList<Meal> = mutableListOf<Meal>()
        for(meal in meals) {
            var _meal = meal.copy(category = category)
            _meals.add(_meal)
        }
        appDatabase.mealsDao().insertAll(_meals)
    }

}