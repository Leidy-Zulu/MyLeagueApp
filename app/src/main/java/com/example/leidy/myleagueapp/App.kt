package com.example.leidy.myleagueapp

import com.example.leidy.myleagueapp.di.AppComponent
import com.example.leidy.myleagueapp.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication


class App : DaggerApplication() {

    var mAppComponent: AppComponent? = null

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val component = DaggerAppComponent.builder()
                .application(this)
                .build()
        mAppComponent = component
        component.inject(this)
        return component
    }
}