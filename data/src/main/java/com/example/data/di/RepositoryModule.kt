package com.example.data.di

import com.example.data.repositories.EventRepository
import com.example.data.repositories.LeagueRepository
import com.example.data.service.IEventService
import com.example.data.service.ILeagueService
import com.example.domain.repositories.IEventRepository
import com.example.domain.repositories.ILeagueRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [ServiceModule::class])
class RepositoryModule {

    @Provides
    @Singleton
    fun provideLeagueRepository(iLeagueService: ILeagueService): ILeagueRepository = LeagueRepository(iLeagueService)


    @Provides
    @Singleton
    fun provideEventRepository(iEventService: IEventService): IEventRepository = EventRepository(iEventService)
}