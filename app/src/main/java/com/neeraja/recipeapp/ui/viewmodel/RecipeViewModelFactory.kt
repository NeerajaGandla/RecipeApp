package com.neeraja.recipeapp.ui.viewmodel

import dagger.assisted.AssistedFactory

@AssistedFactory
interface RecipeViewModelFactory {
    fun create(mealId: Int?): RecipeViewModel
}