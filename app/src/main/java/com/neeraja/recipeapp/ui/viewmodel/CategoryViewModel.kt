package com.neeraja.recipeapp.ui.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mindorks.framework.mvvm.utils.Resource
import com.neeraja.recipeapp.data.AppDataManager
import com.neeraja.recipeapp.data.model.api.CategoriesResponse
import com.neeraja.recipeapp.data.repository.CategoryRepository
import com.neeraja.recipeapp.utils.NetworkHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CategoryViewModel @ViewModelInject constructor(
    private val dataManager: AppDataManager,
    private val networkHelper: NetworkHelper
) : ViewModel() {

    private val _categories = MutableLiveData<Resource<CategoriesResponse>>()

    val categories: LiveData<Resource<CategoriesResponse>>
        get() = _categories

    init {
        fetchCategories()
    }

    private fun fetchCategories() {
        viewModelScope.launch {
            _categories.postValue(Resource.loading(null))
            if (networkHelper.isNetworkConnected()) {
                launch(Dispatchers.IO) {
                    dataManager.getCategories().let {
                        if (it.isSuccessful) {
                            _categories.postValue(Resource.success(it.body()))
                        } else _categories.postValue(
                            Resource.error(
                                it.errorBody().toString(),
                                null
                            )
                        )
                    }
                }
            } else _categories.postValue(Resource.error("No Internet Connection", null))
        }
    }
}