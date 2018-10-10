package com.example.leidy.myleagueapp.leagues

import com.example.domain.models.Team


interface ILeagueContract {

    interface  View {
        fun showListTeam(teams: List<Team>)

    }

    interface Presenter {

        fun view(view: View)

        fun getTeams(codeTeam: Int)
    }
}