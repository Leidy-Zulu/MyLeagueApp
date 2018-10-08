package com.example.leidy.myleagueapp.di

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [InteractorsModule::class])
class AppModule(val mApplication: Application) {

   /* @Provides
    @Singleton
    fun provideApp() = mApplication
*/
}