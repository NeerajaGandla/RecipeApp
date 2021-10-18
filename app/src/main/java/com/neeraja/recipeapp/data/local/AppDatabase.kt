package com.neeraja.recipeapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.neeraja.recipeapp.data.local.dao.CategoryDao
import com.neeraja.recipeapp.data.local.dao.MealDao
import com.neeraja.recipeapp.data.model.db.Category
import com.neeraja.recipeapp.data.model.db.Meal

@Database(entities = [Category::class, Meal::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun categoriesDao() : CategoryDao
    abstract fun mealsDao() : MealDao
}