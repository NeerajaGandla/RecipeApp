package com.neeraja.recipeapp.data.local.dao

import androidx.room.*
import com.neeraja.recipeapp.data.model.db.Category
import com.neeraja.recipeapp.data.model.db.Meal

@Dao
interface MealDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(options: MutableList<Meal>)

    @Query("SELECT * FROM meals WHERE category = :category")
    fun loadAll(category: String): List<Meal>

    @Query("SELECT isFavorite FROM meals WHERE id = :mealId")
    fun isFavorite(mealId: Int): Int

    @Update
    fun setFavorite(meal: Meal)

    @Query("SELECT * FROM meals WHERE isFavorite = 1")
    fun getFavoriteMeals(): List<Meal>
}