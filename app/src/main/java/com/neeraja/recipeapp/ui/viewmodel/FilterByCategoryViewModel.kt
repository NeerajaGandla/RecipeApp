package com.neeraja.recipeapp.ui.viewmodel

import androidx.lifecycle.*
import com.neeraja.recipeapp.utils.*
import com.neeraja.recipeapp.utils.CATEGORY
import com.neeraja.recipeapp.utils.IS_FAVORITES
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
import kotlinx.coroutines.*


@HiltViewModel
class FilterByCategoryViewModel @Inject constructor(
    val dataManager: AppDataManager,
    val networkHelper: NetworkHelper,
    private val state: SavedStateHandle
) : ViewModel() {

    val _meals = MutableLiveData<Resource<MealsResponse>>()

    fun fetchMealsByCategory(category: String?) {
        viewModelScope.launch {
            _meals.postValue(Resource.loading(null))
            if (networkHelper.isNetworkConnected()) {
                launch(Dispatchers.IO) {
                    category?.let { value ->
                        dataManager.getMealsByCategory(value).let {
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
                            println("Body: " + it.body().toString())
                            _meals.postValue(Resource.success(it.body()))
                            println(_meals.getValue().toString())
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

    fun getCategory(): LiveData<String> {
        return state.getLiveData(CATEGORY)
    }

    fun getIsFavorites(): LiveData<String> {
        return state.getLiveData(IS_FAVORITES)
    }

    fun saveState(isFavorites: String, category: String?) {
        state.set(IS_FAVORITES, isFavorites)
        state.set(CATEGORY, category)
        val str = getIsFavorites().getValue()
        if (str.equals("Y")) fetchFavorites()
        else fetchMealsByCategory(getCategory().getValue())
    }

    fun onFavoriteClicked(meal: Meal) {
        viewModelScope.launch {
            val job = launch(Dispatchers.IO) {
                val isFavorite = dataManager.isFavorite(meal.id)
                val _meal = meal.copy(
                    isFavorite = when (isFavorite) {
                        1 -> 0
                        else -> 1
                    }
                )
                dataManager.setFavorite(_meal)
            }
            job.join()
            if (getIsFavorites().getValue().equals("Y"))
                fetchFavorites()
            else
                fetchMealsByCategory(getCategory().getValue())
        }
    }
}