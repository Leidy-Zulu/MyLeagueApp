package com.example.data.mapper

import com.example.data.model.ApiTeam
import com.example.domain.models.Team
import io.reactivex.functions.Function

object ApiTeamMapper: Function<ApiTeam, Team> {


    override fun apply(t: ApiTeam): Team {
        return Team(
                t.idTeam,
                t.strTeam,
                t.strStadium,
                t.strTeamBadge,
                t.strDescriptionES,
                t.intFormedYear,
                t.strTeamJersey,
                t.strWebsite,
                t.strFacebook,
                t.strTwitter,
                t.strInstagram,
                t.strYoutube
        )
    }
}