package com.example.data.service

import retrofit2.http.GET

interface ILeagueService {

    @GET("aas")
    fun getLeagues()
}