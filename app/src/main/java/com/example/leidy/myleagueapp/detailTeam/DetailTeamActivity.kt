package com.example.leidy.myleagueapp.detailTeam

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.leidy.myleagueapp.R
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class DetailTeamActivity : DaggerAppCompatActivity(), IDetailTeamContract.View{

    @Inject
    lateinit var mPresenter: IDetailTeamContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league_detail)
        mPresenter.view(this)
    }
}