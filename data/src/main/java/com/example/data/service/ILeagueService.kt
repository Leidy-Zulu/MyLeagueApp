package com.example.data.service

import com.example.data.model.ApiTeams
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface ILeagueService {

    @GET("lookup_all_teams.php")
    fun getTeams(@Query("id") codeTeam: Int) : Observable<ApiTeams>

}