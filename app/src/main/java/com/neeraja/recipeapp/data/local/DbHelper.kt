package com.neeraja.recipeapp.data.local

import com.neeraja.recipeapp.data.model.db.Category

interface DbHelper {
    suspend fun getCategories(): List<Category>
    suspend fun saveCategories(categories: List<Category>)
}