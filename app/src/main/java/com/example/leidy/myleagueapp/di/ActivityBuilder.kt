package com.example.leidy.myleagueapp.di

import com.example.leidy.myleagueapp.leagues.LeagueActivity
import com.example.leidy.myleagueapp.leagues.LeagueActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [(LeagueActivityModule::class)])
    abstract fun bindLeagueActivity(): LeagueActivity
}