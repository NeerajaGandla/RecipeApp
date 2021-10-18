package com.neeraja.recipeapp.data.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.neeraja.recipeapp.data.local.dao.CategoryDao;
import com.neeraja.recipeapp.data.local.dao.MealDao;
import com.neeraja.recipeapp.data.model.db.Category;
import com.neeraja.recipeapp.data.model.db.Meal;

@androidx.room.Database(entities = {com.neeraja.recipeapp.data.model.db.Category.class, com.neeraja.recipeapp.data.model.db.Meal.class}, version = 1)
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/neeraja/recipeapp/data/local/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "categoriesDao", "Lcom/neeraja/recipeapp/data/local/dao/CategoryDao;", "mealsDao", "Lcom/neeraja/recipeapp/data/local/dao/MealDao;", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.neeraja.recipeapp.data.local.dao.CategoryDao categoriesDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.neeraja.recipeapp.data.local.dao.MealDao mealsDao();
    
    public AppDatabase() {
        super();
    }
}