package com.example.leidy.myleagueapp.leagues

import com.example.domain.models.Team
import com.example.leidy.myleagueapp.adapters.IItemListener


interface ILeagueContract {

    interface  View: IItemListener {
        fun showListTeam(teams: List<Team>)

    }

    interface Presenter{

        fun view(view: View)

        fun getTeams(codeTeam: Int)
    }
}