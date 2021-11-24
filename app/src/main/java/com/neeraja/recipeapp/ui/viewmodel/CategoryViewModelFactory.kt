package com.neeraja.recipeapp.ui.viewmodel

import androidx.lifecycle.SavedStateHandle
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory

@AssistedFactory
interface CategoryViewModelFactory {
    fun create(@Assisted state: SavedStateHandle): CategoryViewModel
}