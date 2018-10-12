package com.example.data.di

import com.example.data.service.IEventService
import com.example.data.service.ILeagueService
import com.example.data.util.TEN
import com.example.data.util.URL_BASE
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
class ServiceModule {

    @Provides
    @Singleton
    fun provideBaseService(): Retrofit {
        val okHttpClient: OkHttpClient = OkHttpClient.Builder()
                .connectTimeout(TEN, TimeUnit.SECONDS)
                .writeTimeout(TEN, TimeUnit.SECONDS)
                .readTimeout(TEN, TimeUnit.SECONDS)
                .build()

        return Retrofit.Builder()
                .baseUrl(URL_BASE)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()

    }

    @Provides
    @Singleton
    fun provideLeagueService(retrofit: Retrofit): ILeagueService = retrofit.create(ILeagueService::class.java)

    @Provides
    @Singleton
    fun provideEventService(retrofit: Retrofit): IEventService = retrofit.create(IEventService::class.java)
}