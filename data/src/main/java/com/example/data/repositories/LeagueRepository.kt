package com.example.data.repositories

import com.example.data.mapper.APITeamsMapper
import com.example.data.mapper.ApiEventsMapper
import com.example.data.service.ILeagueService
import com.example.domain.models.Event
import com.example.domain.models.Events
import com.example.domain.models.Teams
import com.example.domain.repositories.ILeagueRepository
import io.reactivex.Observable

class LeagueRepository(private val mLeagueService: ILeagueService) : ILeagueRepository{



    override fun getTeams(codeTeam: Int): Observable<Teams> {
        return mLeagueService.getTeams(codeTeam).map {
            APITeamsMapper.apply(it)
        }
    }


}