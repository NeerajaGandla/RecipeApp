package com.neeraja.recipeapp.ui.viewmodel

import androidx.lifecycle.*
import com.neeraja.recipeapp.utils.Resource
import com.neeraja.recipeapp.data.AppDataManager
import com.neeraja.recipeapp.data.model.api.MealsResponse
import com.neeraja.recipeapp.utils.NetworkHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import androidx.databinding.DataBindingUtil
import com.squareup.inject.assisted.Assisted
import com.squareup.inject.assisted.AssistedInject
import androidx.hilt.lifecycle.ViewModelInject

class FilterByCategoryViewModel @ViewModelInject constructor(
    val dataManager: AppDataManager,
    val networkHelper: NetworkHelper,
    val category: String
) : ViewModel() {

//    @AssistedInject.Factory
//    interface Factory {
//        override fun create(category: String): FilterByCategoryViewModel
//    }
//
//    companion object {
//        fun provideFactory(
//            assistedFactory: Factory,
//            category: String
//        ): ViewModelProvider.Factory = object : ViewModelProvider.Factory {
//            override fun <T : ViewModel?> create(modelClass: Class<T>): T {
//                return assistedFactory.create(itemId) as T
//            }
//        }
//    }

    private val _meals = MutableLiveData<Resource<MealsResponse>>()
    val meals: LiveData<Resource<MealsResponse>>
        get() = _meals

    init {
        fetchMealsByCategory(category)
    }

    private fun fetchMealsByCategory(category: String) {
        viewModelScope.launch {
            _meals.postValue(Resource.loading(null))
            if (networkHelper.isNetworkConnected()) {
                launch(Dispatchers.IO) {
                    dataManager.getMealsByCategory(category).let {
                        if (it.isSuccessful) {
                            _meals.postValue(Resource.success(it.body()))
                        } else _meals.postValue(
                            Resource.error(
                                it.errorBody().toString(),
                                null
                            )
                        )
                    }
                }
            } else _meals.postValue(Resource.error("No Internet Connection", null))
        }
    }
}