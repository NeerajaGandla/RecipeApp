package com.neeraja.recipeapp.ui.viewmodel

import androidx.lifecycle.*
import com.neeraja.recipeapp.utils.Resource
import com.neeraja.recipeapp.data.AppDataManager
import com.neeraja.recipeapp.data.model.api.MealsResponse
import com.neeraja.recipeapp.data.model.db.Meal
import com.neeraja.recipeapp.utils.NetworkHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import androidx.databinding.DataBindingUtil
import androidx.hilt.lifecycle.ViewModelInject
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class FilterByCategoryViewModel @Inject constructor(
    val dataManager: AppDataManager,
    val networkHelper: NetworkHelper,
    val category: String?,
    val isFavorites: String = "N"
) : ViewModel() {

    private val _meals = MutableLiveData<Resource<MealsResponse>>()
    val meals: LiveData<Resource<MealsResponse>>
        get() = _meals

    init {
        if (isFavorites.equals("Y")) fetchFavorites()
        else fetchMealsByCategory(category)
    }

    fun fetchMealsByCategory(category: String?) {
        viewModelScope.launch {
            _meals.postValue(Resource.loading(null))
            if (networkHelper.isNetworkConnected()) {
                launch(Dispatchers.IO) {
                    dataManager.getMealsByCategory(category!!).let {
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

    fun fetchFavorites() {
        viewModelScope.launch {
            _meals.postValue(Resource.loading(null))
            if (networkHelper.isNetworkConnected()) {
                launch(Dispatchers.IO) {
                    dataManager.getFavoriteMeals().let {
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


    fun onFavoriteClicked(meal: Meal) {
        viewModelScope.launch {
            val job = launch(Dispatchers.IO) {
                val isFavorite = dataManager.isFavorite(meal)
                val _meal = meal.copy(
                    isFavorite = when (isFavorite) {
                        1 -> 0
                        else -> 1
                    }
                )
                dataManager.setFavorite(_meal)
            }
            job.join()
            if (isFavorites.equals("Y"))
                fetchFavorites()
            else
                fetchMealsByCategory(category)
        }
    }
}