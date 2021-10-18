package com.neeraja.recipeapp.di.module

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.neeraja.recipeapp.BuildConfig
import com.neeraja.recipeapp.data.AppDataManager
import com.neeraja.recipeapp.data.DataManager
import com.neeraja.recipeapp.data.local.AppDatabase
import com.neeraja.recipeapp.data.local.AppDbHelper
import com.neeraja.recipeapp.data.local.DbHelper
import com.neeraja.recipeapp.data.remote.ApiHelper
import com.neeraja.recipeapp.data.remote.ApiService
import com.neeraja.recipeapp.data.remote.AppApiHelper
import com.neeraja.recipeapp.utils.DB_NAME
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton
import androidx.lifecycle.ViewModelProvider
import com.neeraja.recipeapp.ui.viewmodel.FilterByCategoryViewModel

import dagger.Binds

@Module
@InstallIn(SingletonComponent::class)
class ApplicationModule {

    @Provides
    fun provideBaseUrl() = BuildConfig.BASE_URL

    @Provides
    @Singleton
    fun provideOkHttpClient() = if (BuildConfig.DEBUG) {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()
    } else OkHttpClient
        .Builder()
        .build()

    @Provides
    fun provideMoshi(): Moshi {
        return Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(
        okHttpClient: OkHttpClient,
        BASE_URL: String,
        moshi: Moshi
    ): Retrofit =
        Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .baseUrl(BASE_URL)
            .client(okHttpClient).build()

    @Provides
    @Singleton
    fun provideContext(application: Application): Context {
        return application
    }

    @Provides
    @DatabaseInfo
    fun provideDatabaseName(): String {
        return DB_NAME
    }

    @Provides
    @Singleton
    fun provideAppDatabase(@DatabaseInfo dbName: String, context: Context): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, dbName)
            .fallbackToDestructiveMigration().build()
    }

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)

    @Provides
    @Singleton
    fun provideApiHelper(apiHelper: AppApiHelper): ApiHelper = apiHelper

    @Provides
    @Singleton
    fun provideDbHelper(dbHelper: AppDbHelper): DbHelper = dbHelper

    @Provides
    @Singleton
    fun provideDataManager(dataManager: AppDataManager): DataManager = dataManager
}