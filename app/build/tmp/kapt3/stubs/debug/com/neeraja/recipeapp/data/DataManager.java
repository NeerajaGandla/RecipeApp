package com.neeraja.recipeapp.data;

import com.neeraja.recipeapp.data.model.api.CategoriesResponse;
import com.neeraja.recipeapp.data.model.api.MealsResponse;
import retrofit2.Response;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/neeraja/recipeapp/data/DataManager;", "", "getCategories", "Lretrofit2/Response;", "Lcom/neeraja/recipeapp/data/model/api/CategoriesResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMealsByCategory", "Lcom/neeraja/recipeapp/data/model/api/MealsResponse;", "category", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface DataManager {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCategories(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.neeraja.recipeapp.data.model.api.CategoriesResponse>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMealsByCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.neeraja.recipeapp.data.model.api.MealsResponse>> p1);
}