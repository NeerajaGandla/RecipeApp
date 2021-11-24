package com.neeraja.recipeapp.ui.viewmodel

import android.os.Bundle
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import androidx.savedstate.SavedStateRegistryOwner
import com.neeraja.recipeapp.utils.Resource
import com.neeraja.recipeapp.data.AppDataManager
import com.neeraja.recipeapp.data.model.api.CategoriesResponse
import com.neeraja.recipeapp.utils.NetworkHelper
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class CategoryViewModel @ViewModelInject constructor(
    private val dataManager: AppDataManager,
    private val networkHelper: NetworkHelper
) : ViewModel() {

    private val _searchText = MutableLiveData<String>()
    val searchText = _searchText

    private val _categories = MutableLiveData<Resource<CategoriesResponse>>()
    val categories: LiveData<Resource<CategoriesResponse>>
        get() = _categories

    init {
        fetchCategories()
    }

    fun setSearchText(value: String) {
        _searchText.value = value
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