package com.example.data.service

import com.example.data.model.ApiTeams
import com.example.domain.models.Teams
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.*

interface ILeagueService {

    @GET("lookup_all_teams.php")
    fun getTeams(@Query("id") codeTeam: Int) : Observable<ApiTeams>
}