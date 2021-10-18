package com.neeraja.recipeapp.ui.viewmodel

import androidx.lifecycle.ViewModelProvider
import android.app.Application
import androidx.lifecycle.ViewModel
import com.neeraja.recipeapp.data.AppDataManager
import com.neeraja.recipeapp.utils.NetworkHelper

class FilterByTypeViewModelFactory constructor(val dataManager: AppDataManager,
                                               val networkHelper: NetworkHelper,
                                               val category: String) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return FilterByCategoryViewModel(dataManager , networkHelper , category) as T
    }
}