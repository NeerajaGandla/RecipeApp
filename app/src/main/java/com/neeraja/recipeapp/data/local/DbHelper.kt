package com.neeraja.recipeapp.data.local

import com.neeraja.recipeapp.data.model.db.Category
import com.neeraja.recipeapp.data.model.db.Meal

interface DbHelper {
    suspend fun getCategories(): List<Category>
    suspend fun saveCategories(categories: List<Category>)
    suspend fun getMealsByCategory(category: String): List<Meal>
    suspend fun saveMealsByCategory(meals: MutableList<Meal>, category: String)
    suspend fun isFavorite(mealId: Int) : Int
    suspend fun setFavorite(meal: Meal)
    suspend fun setFavorite(mealId: Int, isFavorite: Int)
    suspend fun getFavoriteMeals(): List<Meal>
}