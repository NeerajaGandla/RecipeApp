package com.neeraja.recipeapp.data;

import com.neeraja.recipeapp.data.model.api.CategoriesResponse;
import com.neeraja.recipeapp.data.model.api.MealsResponse;
import com.neeraja.recipeapp.data.model.api.RecipeResponse;
import com.neeraja.recipeapp.data.model.db.Meal;
import retrofit2.Response;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u0006\u0010\t\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\u000e\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/neeraja/recipeapp/data/DataManager;", "", "getCategories", "Lretrofit2/Response;", "Lcom/neeraja/recipeapp/data/model/api/CategoriesResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavoriteMeals", "Lcom/neeraja/recipeapp/data/model/api/MealsResponse;", "getMealsByCategory", "category", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecipeDetails", "Lcom/neeraja/recipeapp/data/model/api/RecipeResponse;", "idMeal", "isFavorite", "", "meal", "Lcom/neeraja/recipeapp/data/model/db/Meal;", "(Lcom/neeraja/recipeapp/data/model/db/Meal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setFavorite", "", "app_debug"})
public abstract interface DataManager {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCategories(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.neeraja.recipeapp.data.model.api.CategoriesResponse>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMealsByCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.neeraja.recipeapp.data.model.api.MealsResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object isFavorite(@org.jetbrains.annotations.NotNull()
    com.neeraja.recipeapp.data.model.db.Meal meal, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object setFavorite(@org.jetbrains.annotations.NotNull()
    com.neeraja.recipeapp.data.model.db.Meal meal, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFavoriteMeals(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.neeraja.recipeapp.data.model.api.MealsResponse>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRecipeDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String idMeal, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.neeraja.recipeapp.data.model.api.RecipeResponse>> p1);
}