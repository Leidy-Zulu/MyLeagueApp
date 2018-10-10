package com.example.leidy.myleagueapp.leagues

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.domain.models.Team
import com.example.leidy.myleagueapp.R
import com.example.leidy.myleagueapp.utils.SPANISH_LA_LIGA
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_league.*
import javax.inject.Inject
import android.support.v7.widget.LinearLayoutManager
import com.example.leidy.myleagueapp.adapters.TeamAdapter
import android.content.Intent
import com.example.leidy.myleagueapp.detail.DetailTeamActivity
import com.example.leidy.myleagueapp.utils.TEAM


class LeagueActivity : DaggerAppCompatActivity(), ILeagueContract.View {

    private var teamAdapter: TeamAdapter? = null


    @Inject
    lateinit var presenter: ILeagueContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
        presenter.view(this)
        presenter.getTeams(SPANISH_LA_LIGA)
    }

    override fun showListTeam(teams: List<Team>) {
       loadingView(true)
        loadListTeam(teams)
    }

    private fun loadListTeam(teams: List<Team>) {
        teamAdapter = TeamAdapter(this, teams)
        val linearLayoutManager = LinearLayoutManager(this)
        recyclerViewTeam.setLayoutManager(linearLayoutManager)
        recyclerViewTeam.setAdapter(teamAdapter)
    }

    private fun loadingView(isShowing: Boolean) {
        progressBar.visibility = if (isShowing) View.GONE else View.VISIBLE
        linearLayoutContent.visibility = if (isShowing) View.VISIBLE else View.GONE
    }

    override fun itemClick(team: Team) {
        val intent = Intent(this, DetailTeamActivity::class.java)
        intent.putExtra(TEAM, team)
        startActivity(intent)
    }

}
