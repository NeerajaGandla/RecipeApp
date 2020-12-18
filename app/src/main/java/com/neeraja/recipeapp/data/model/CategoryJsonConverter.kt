package com.neeraja.recipeapp.data.model

import android.provider.MediaStore.Video
import com.neeraja.recipeapp.di.module.Wrapped
import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson
import java.lang.UnsupportedOperationException

class CategoryJsonConverter {
    @ToJson
    @Wrapped
    fun toJson(json: CategoriesResponse): List<Category> {
        return json.categories
    }

    @FromJson
    fun fromJson(@Wrapped json: List<Category>): CategoriesResponse {
        return CategoriesResponse(json)
    }
}