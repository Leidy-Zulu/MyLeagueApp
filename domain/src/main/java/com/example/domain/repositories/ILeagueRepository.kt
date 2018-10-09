package com.example.domain.repositories

import com.example.domain.models.Teams
import io.reactivex.Observable

interface ILeagueRepository {
    fun getTeams(codeTeam: Int): Observable<Teams>
}