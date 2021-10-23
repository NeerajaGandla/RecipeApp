package com.neeraja.recipeapp.ui.view.clicklisteners
import com.neeraja.recipeapp.data.model.db.Meal

interface MealClickListener {
    fun onMealClicked(meal: Meal)
}