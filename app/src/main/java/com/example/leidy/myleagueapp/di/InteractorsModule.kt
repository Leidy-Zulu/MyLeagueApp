package com.example.leidy.myleagueapp.di

import com.example.data.di.RepositoryModule
import com.example.domain.interactos.GetLeaguesInteractor
import com.example.domain.interactos.base.IUseCase

import com.example.domain.models.Teams
import com.example.domain.repositories.ILeagueRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [RepositoryModule::class])
class InteractorsModule {

    @Provides
    @Singleton
    fun provideGetTeamsUseCase(iLeagueRepository: ILeagueRepository):
            IUseCase<Teams, Int> = GetLeaguesInteractor(iLeagueRepository)
}