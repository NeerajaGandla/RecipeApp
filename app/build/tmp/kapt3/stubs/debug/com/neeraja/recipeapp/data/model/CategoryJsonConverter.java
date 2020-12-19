package com.neeraja.recipeapp.data.model;

import android.provider.MediaStore.Video;
import com.neeraja.recipeapp.di.module.Wrapped;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;
import java.lang.UnsupportedOperationException;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/neeraja/recipeapp/data/model/CategoryJsonConverter;", "", "()V", "fromJson", "Lcom/neeraja/recipeapp/data/model/CategoriesResponse;", "json", "", "Lcom/neeraja/recipeapp/data/model/Category;", "toJson", "app_debug"})
public final class CategoryJsonConverter {
    
    @org.jetbrains.annotations.NotNull()
    @com.neeraja.recipeapp.di.module.Wrapped()
    @com.squareup.moshi.ToJson()
    public final java.util.List<com.neeraja.recipeapp.data.model.Category> toJson(@org.jetbrains.annotations.NotNull()
    com.neeraja.recipeapp.data.model.CategoriesResponse json) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.FromJson()
    public final com.neeraja.recipeapp.data.model.CategoriesResponse fromJson(@org.jetbrains.annotations.NotNull()
    @com.neeraja.recipeapp.di.module.Wrapped()
    java.util.List<com.neeraja.recipeapp.data.model.Category> json) {
        return null;
    }
    
    public CategoryJsonConverter() {
        super();
    }
}