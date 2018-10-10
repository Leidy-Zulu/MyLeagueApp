package com.example.leidy.myleagueapp.leagues

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.domain.models.Team
import com.example.leidy.myleagueapp.R
import com.example.leidy.myleagueapp.utils.SPANISH_LA_LIGA
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class LeagueActivity : DaggerAppCompatActivity(), ILeagueContract.View {


    @Inject
    lateinit var presenter: ILeagueContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
        presenter.view(this)
        presenter.getTeams(SPANISH_LA_LIGA)
    }

    override fun showListTeam(teams: List<Team>) {
        Log.i("teamsActivity", teams.size.toString())
    }
}
