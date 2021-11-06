package com.neeraja.recipeapp.data;

import com.neeraja.recipeapp.data.local.DbHelper;
import com.neeraja.recipeapp.data.model.api.CategoriesResponse;
import com.neeraja.recipeapp.data.model.api.MealsResponse;
import com.neeraja.recipeapp.data.model.api.RecipeResponse;
import com.neeraja.recipeapp.data.remote.ApiHelper;
import com.neeraja.recipeapp.data.model.db.Meal;
import retrofit2.Response;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/neeraja/recipeapp/data/AppDataManager;", "Lcom/neeraja/recipeapp/data/DataManager;", "apiHelper", "Lcom/neeraja/recipeapp/data/remote/ApiHelper;", "dbHelper", "Lcom/neeraja/recipeapp/data/local/DbHelper;", "(Lcom/neeraja/recipeapp/data/remote/ApiHelper;Lcom/neeraja/recipeapp/data/local/DbHelper;)V", "getCategories", "Lretrofit2/Response;", "Lcom/neeraja/recipeapp/data/model/api/CategoriesResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavoriteMeals", "Lcom/neeraja/recipeapp/data/model/api/MealsResponse;", "getMealsByCategory", "category", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecipeDetails", "Lcom/neeraja/recipeapp/data/model/api/RecipeResponse;", "idMeal", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isFavorite", "meal", "Lcom/neeraja/recipeapp/data/model/db/Meal;", "(Lcom/neeraja/recipeapp/data/model/db/Meal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setFavorite", "", "app_debug"})
public final class AppDataManager implements com.neeraja.recipeapp.data.DataManager {
    private final com.neeraja.recipeapp.data.remote.ApiHelper apiHelper = null;
    private final com.neeraja.recipeapp.data.local.DbHelper dbHelper = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCategories(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.neeraja.recipeapp.data.model.api.CategoriesResponse>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getMealsByCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.neeraja.recipeapp.data.model.api.MealsResponse>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object isFavorite(@org.jetbrains.annotations.NotNull()
    com.neeraja.recipeapp.data.model.db.Meal meal, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object setFavorite(@org.jetbrains.annotations.NotNull()
    com.neeraja.recipeapp.data.model.db.Meal meal, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getFavoriteMeals(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.neeraja.recipeapp.data.model.api.MealsResponse>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getRecipeDetails(int idMeal, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.neeraja.recipeapp.data.model.api.RecipeResponse>> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public AppDataManager(@org.jetbrains.annotations.NotNull()
    com.neeraja.recipeapp.data.remote.ApiHelper apiHelper, @org.jetbrains.annotations.NotNull()
    com.neeraja.recipeapp.data.local.DbHelper dbHelper) {
        super();
    }
}