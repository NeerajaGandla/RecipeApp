package com.neeraja.recipeapp.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.neeraja.recipeapp.data.model.db.Category
import com.neeraja.recipeapp.data.model.db.Meal

@Dao
interface MealDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(options: MutableList<Meal>)

    @Query("SELECT * FROM meals WHERE category = :category")
    fun loadAll(category: String): List<Meal>
}