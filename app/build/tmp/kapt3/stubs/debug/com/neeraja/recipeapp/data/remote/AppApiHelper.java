package com.neeraja.recipeapp.data.remote;

import com.neeraja.recipeapp.data.model.api.CategoriesResponse;
import com.neeraja.recipeapp.data.model.api.MealsResponse;
import retrofit2.Response;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/neeraja/recipeapp/data/remote/AppApiHelper;", "Lcom/neeraja/recipeapp/data/remote/ApiHelper;", "apiService", "Lcom/neeraja/recipeapp/data/remote/ApiService;", "(Lcom/neeraja/recipeapp/data/remote/ApiService;)V", "getCategories", "Lretrofit2/Response;", "Lcom/neeraja/recipeapp/data/model/api/CategoriesResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMealsByCategory", "Lcom/neeraja/recipeapp/data/model/api/MealsResponse;", "category", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class AppApiHelper implements com.neeraja.recipeapp.data.remote.ApiHelper {
    private final com.neeraja.recipeapp.data.remote.ApiService apiService = null;
    
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
    
    @javax.inject.Inject()
    public AppApiHelper(@org.jetbrains.annotations.NotNull()
    com.neeraja.recipeapp.data.remote.ApiService apiService) {
        super();
    }
}