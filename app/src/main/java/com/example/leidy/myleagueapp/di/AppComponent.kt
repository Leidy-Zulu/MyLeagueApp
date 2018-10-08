package com.example.leidy.myleagueapp.di

import android.content.Context
import com.example.leidy.myleagueapp.leagues.LeagueActivity
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [(AndroidSupportInjectionModule::class),
                (AppModule::class),
                (InteractorsModule::class)])

interface AppComponent: AndroidInjector<DaggerApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Context): Builder

        fun build(): AppComponent
    }

    fun inject(leagueActivity: LeagueActivity)
}