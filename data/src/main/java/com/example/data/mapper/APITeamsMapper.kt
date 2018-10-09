package com.example.data.mapper

import com.example.data.model.ApiTeams
import com.example.domain.models.Teams
import io.reactivex.functions.Function


object APITeamsMapper : Function<ApiTeams, Teams>{


    override fun apply(t: ApiTeams): Teams {
       return Teams(
               t.teams
       )
    }
}