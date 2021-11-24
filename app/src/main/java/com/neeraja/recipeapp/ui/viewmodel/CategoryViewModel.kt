package com.neeraja.recipeapp.ui.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import com.neeraja.recipeapp.utils.Resource
import com.neeraja.recipeapp.data.AppDataManager
import com.neeraja.recipeapp.data.model.api.CategoriesResponse
import com.neeraja.recipeapp.utils.NetworkHelper
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CategoryViewModel @AssistedInject constructor(
    private val dataManager: AppDataManager,
    private val networkHelper: NetworkHelper,
    @Assisted private val state: SavedStateHandle
) : ViewModel() {
    private val SEARCH_TEXT_KEY = "SEARCH_TEXT"

    private val _searchText = MutableLiveData<String>()
    val searchText = _searchText

    private val _categories = MutableLiveData<Resource<CategoriesResponse>>()
    val categories: LiveData<Resource<CategoriesResponse>>
        get() = _categories

    class Factory(
        private val assistedFactory: CategoryViewModelFactory,
        private val state: SavedStateHandle
    ) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return assistedFactory.create(state) as T
        }

    }

    init {
        fetchCategories()
    }

    fun getSearchText(): String? = state.get(SEARCH_TEXT_KEY) as String?

    fun setSearchText(value: String) {
//        state.set(SEARCH_TEXT_KEY, value)
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