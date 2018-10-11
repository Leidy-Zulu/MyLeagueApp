package com.example.data.service

import com.example.data.model.ApiEvents
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface IEventService {

    @GET("eventsnext.php")
    fun getEvents(@Query("id")codeEvent: Int): Observable<ApiEvents>
}