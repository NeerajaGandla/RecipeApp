package com.neeraja.recipeapp.data.remote;

import com.neeraja.recipeapp.data.model.api.CategoriesResponse;
import com.neeraja.recipeapp.data.model.api.MealsResponse;
import com.neeraja.recipeapp.data.model.api.RecipeResponse;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\r\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/neeraja/recipeapp/data/remote/ApiService;", "", "getCategories", "Lretrofit2/Response;", "Lcom/neeraja/recipeapp/data/model/api/CategoriesResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMealsByCategory", "Lcom/neeraja/recipeapp/data/model/api/MealsResponse;", "category", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecipeDetails", "Lcom/neeraja/recipeapp/data/model/api/RecipeResponse;", "mealId", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "categories.php")
    public abstract java.lang.Object getCategories(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.neeraja.recipeapp.data.model.api.CategoriesResponse>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "filter.php")
    public abstract java.lang.Object getMealsByCategory(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "c")
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.neeraja.recipeapp.data.model.api.MealsResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "lookup.php")
    public abstract java.lang.Object getRecipeDetails(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "i")
    java.lang.String mealId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.neeraja.recipeapp.data.model.api.RecipeResponse>> p1);
}