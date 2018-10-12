package com.example.leidy.myleagueapp.detailTeam

import com.example.domain.models.Event


interface IDetailTeamContract {

    interface View {
        fun showListEvent(events: List<Event>)


    }

    interface Presenter{

        fun view(view: View)
        fun getEvents(idEvent: Int)
    }
}