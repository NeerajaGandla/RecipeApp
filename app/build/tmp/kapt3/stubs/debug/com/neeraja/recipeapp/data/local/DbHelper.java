package com.neeraja.recipeapp.data.local;

import com.neeraja.recipeapp.data.model.db.Category;
import com.neeraja.recipeapp.data.model.db.Meal;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u0006\u0010\t\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\'\u0010\u0014\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00162\u0006\u0010\t\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ!\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/neeraja/recipeapp/data/local/DbHelper;", "", "getCategories", "", "Lcom/neeraja/recipeapp/data/model/db/Category;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavoriteMeals", "Lcom/neeraja/recipeapp/data/model/db/Meal;", "getMealsByCategory", "category", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isFavorite", "", "mealId", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveCategories", "", "categories", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveMealsByCategory", "meals", "", "(Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setFavorite", "meal", "(Lcom/neeraja/recipeapp/data/model/db/Meal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface DbHelper {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCategories(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.neeraja.recipeapp.data.model.db.Category>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveCategories(@org.jetbrains.annotations.NotNull()
    java.util.List<com.neeraja.recipeapp.data.model.db.Category> categories, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMealsByCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.neeraja.recipeapp.data.model.db.Meal>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveMealsByCategory(@org.jetbrains.annotations.NotNull()
    java.util.List<com.neeraja.recipeapp.data.model.db.Meal> meals, @org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object isFavorite(int mealId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object setFavorite(@org.jetbrains.annotations.NotNull()
    com.neeraja.recipeapp.data.model.db.Meal meal, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object setFavorite(int mealId, int isFavorite, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFavoriteMeals(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.neeraja.recipeapp.data.model.db.Meal>> p0);
}