package com.neeraja.recipeapp.data.model.api

import com.neeraja.recipeapp.data.model.db.Meal
import com.squareup.moshi.Json

data class MealsResponse (@Json(name = "meals")val meals: List<Meal>)