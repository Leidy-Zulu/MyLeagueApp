package com.example

import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Before
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

interface BaseTest<T> {
    var mMockWebServer: MockWebServer?
    var service: T?
    var type: Class<T>

    fun setupWebServer() {
        mMockWebServer = MockWebServer()
        mMockWebServer?.start()
    }

    fun setupWebClient() {
        val okHttpClient = OkHttpClient.Builder()

        val retrofit = Retrofit.Builder()
                .baseUrl(mMockWebServer?.url("/").toString())
                .addConverterFactory(GsonConverterFactory.create(Gson()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient.build())
                .build()
        service = retrofit.create(type)
    }

    @Before
    fun setup() {
        setupWebServer()
        setupWebClient()
    }

    @After
    fun clean() {
        mMockWebServer?.shutdown()
    }
}