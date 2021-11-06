package com.neeraja.recipeapp.data.local;

import com.neeraja.recipeapp.data.model.db.Category;
import com.neeraja.recipeapp.data.model.db.Meal;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\'\u0010\u0019\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u001b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ!\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/neeraja/recipeapp/data/local/AppDbHelper;", "Lcom/neeraja/recipeapp/data/local/DbHelper;", "appDatabase", "Lcom/neeraja/recipeapp/data/local/AppDatabase;", "(Lcom/neeraja/recipeapp/data/local/AppDatabase;)V", "getAppDatabase", "()Lcom/neeraja/recipeapp/data/local/AppDatabase;", "getCategories", "", "Lcom/neeraja/recipeapp/data/model/db/Category;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavoriteMeals", "Lcom/neeraja/recipeapp/data/model/db/Meal;", "getMealsByCategory", "category", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isFavorite", "", "mealId", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveCategories", "", "categories", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveMealsByCategory", "meals", "", "(Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setFavorite", "meal", "(Lcom/neeraja/recipeapp/data/model/db/Meal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class AppDbHelper implements com.neeraja.recipeapp.data.local.DbHelper {
    @org.jetbrains.annotations.NotNull()
    private final com.neeraja.recipeapp.data.local.AppDatabase appDatabase = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCategories(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.neeraja.recipeapp.data.model.db.Category>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveCategories(@org.jetbrains.annotations.NotNull()
    java.util.List<com.neeraja.recipeapp.data.model.db.Category> categories, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getMealsByCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.neeraja.recipeapp.data.model.db.Meal>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveMealsByCategory(@org.jetbrains.annotations.NotNull()
    java.util.List<com.neeraja.recipeapp.data.model.db.Meal> meals, @org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object isFavorite(int mealId, @org.jetbrains.annotations.NotNull()
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
    public java.lang.Object setFavorite(int mealId, int isFavorite, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getFavoriteMeals(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.neeraja.recipeapp.data.model.db.Meal>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.neeraja.recipeapp.data.local.AppDatabase getAppDatabase() {
        return null;
    }
    
    @javax.inject.Inject()
    public AppDbHelper(@org.jetbrains.annotations.NotNull()
    com.neeraja.recipeapp.data.local.AppDatabase appDatabase) {
        super();
    }
}