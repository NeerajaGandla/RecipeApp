package com.neeraja.recipeapp.data.local

import javax.inject.Inject

class AppDbHelper @Inject constructor(private val appDatabase: AppDatabase): DbHelper {

}