package com.neeraja.recipeapp.di.module;

import android.app.Application;
import android.content.Context;
import androidx.room.Room;
import com.neeraja.recipeapp.BuildConfig;
import com.neeraja.recipeapp.data.AppDataManager;
import com.neeraja.recipeapp.data.DataManager;
import com.neeraja.recipeapp.data.local.AppDatabase;
import com.neeraja.recipeapp.data.local.AppDbHelper;
import com.neeraja.recipeapp.data.local.DbHelper;
import com.neeraja.recipeapp.data.remote.ApiHelper;
import com.neeraja.recipeapp.data.remote.ApiService;
import com.neeraja.recipeapp.data.remote.AppApiHelper;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import javax.inject.Singleton;
import androidx.lifecycle.ViewModelProvider;
import com.neeraja.recipeapp.ui.viewmodel.FilterByCategoryViewModel;
import dagger.Binds;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u001a\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u000eH\u0007J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\b\u0010\u0019\u001a\u00020\u000eH\u0007J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\b\u0010\u001e\u001a\u00020\u001fH\u0007J\b\u0010 \u001a\u00020!H\u0007J \u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u001fH\u0007\u00a8\u0006&"}, d2 = {"Lcom/neeraja/recipeapp/di/module/ApplicationModule;", "", "()V", "provideApiHelper", "Lcom/neeraja/recipeapp/data/remote/ApiHelper;", "apiHelper", "Lcom/neeraja/recipeapp/data/remote/AppApiHelper;", "provideApiService", "Lcom/neeraja/recipeapp/data/remote/ApiService;", "retrofit", "Lretrofit2/Retrofit;", "provideAppDatabase", "Lcom/neeraja/recipeapp/data/local/AppDatabase;", "dbName", "", "context", "Landroid/content/Context;", "provideBaseUrl", "provideContext", "application", "Landroid/app/Application;", "provideDataManager", "Lcom/neeraja/recipeapp/data/DataManager;", "dataManager", "Lcom/neeraja/recipeapp/data/AppDataManager;", "provideDatabaseName", "provideDbHelper", "Lcom/neeraja/recipeapp/data/local/DbHelper;", "dbHelper", "Lcom/neeraja/recipeapp/data/local/AppDbHelper;", "provideMoshi", "Lcom/squareup/moshi/Moshi;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "provideRetrofit", "okHttpClient", "BASE_URL", "moshi", "app_debug"})
@dagger.Module()
public final class ApplicationModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final java.lang.String provideBaseUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.squareup.moshi.Moshi provideMoshi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    java.lang.String BASE_URL, @org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.Context provideContext(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @DatabaseInfo()
    @dagger.Provides()
    public final java.lang.String provideDatabaseName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.neeraja.recipeapp.data.local.AppDatabase provideAppDatabase(@org.jetbrains.annotations.NotNull()
    @DatabaseInfo()
    java.lang.String dbName, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.neeraja.recipeapp.data.remote.ApiService provideApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.neeraja.recipeapp.data.remote.ApiHelper provideApiHelper(@org.jetbrains.annotations.NotNull()
    com.neeraja.recipeapp.data.remote.AppApiHelper apiHelper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.neeraja.recipeapp.data.local.DbHelper provideDbHelper(@org.jetbrains.annotations.NotNull()
    com.neeraja.recipeapp.data.local.AppDbHelper dbHelper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.neeraja.recipeapp.data.DataManager provideDataManager(@org.jetbrains.annotations.NotNull()
    com.neeraja.recipeapp.data.AppDataManager dataManager) {
        return null;
    }
    
    public ApplicationModule() {
        super();
    }
}