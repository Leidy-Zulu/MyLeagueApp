package com.example.leidy.myleagueapp.di

import com.example.leidy.myleagueapp.detailTeam.DetailTeamActivity
import com.example.leidy.myleagueapp.detailTeam.DetailTeamActivityModule
import com.example.leidy.myleagueapp.leagues.LeagueActivity
import com.example.leidy.myleagueapp.leagues.LeagueActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [(LeagueActivityModule::class)])
    abstract fun bindLeagueActivity(): LeagueActivity

    @ContributesAndroidInjector(modules = [(DetailTeamActivityModule::class)])
    abstract fun bindDetailTeamActivity(): DetailTeamActivity
}