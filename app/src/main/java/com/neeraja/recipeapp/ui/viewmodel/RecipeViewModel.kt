package com.neeraja.recipeapp.ui.viewmodel

import androidx.lifecycle.*
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.neeraja.recipeapp.utils.Resource
import com.neeraja.recipeapp.data.AppDataManager
import com.neeraja.recipeapp.data.model.api.RecipeResponse
import com.neeraja.recipeapp.utils.NetworkHelper
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RecipeViewModel @Inject constructor(
    val dataManager: AppDataManager,
    val networkHelper: NetworkHelper,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    val _recipe = MutableLiveData<Resource<RecipeResponse>>()

    private fun fetchRecipe() {
        viewModelScope.launch {
            _recipe.postValue(Resource.loading(null))
            if (networkHelper.isNetworkConnected()) {
                launch(Dispatchers.IO) {
                    dataManager.getRecipeDetails(getMealId().getValue()!!).let {
                        if (it.isSuccessful) {
                            _recipe.postValue(Resource.success(it.body()))
                        } else _recipe.postValue(
                            Resource.error(
                                it.errorBody().toString(),
                                null
                            )
                        )
                    }
                }
            } else _recipe.postValue(Resource.error("No Internet Connection", null))
        }
    }

    fun getMealId(): LiveData<Int> {
        return savedStateHandle.getLiveData("MealID")
    }

    fun setMealId(mealId: Int) {
        savedStateHandle.set("MealID", mealId)
        fetchRecipe()
    }
}