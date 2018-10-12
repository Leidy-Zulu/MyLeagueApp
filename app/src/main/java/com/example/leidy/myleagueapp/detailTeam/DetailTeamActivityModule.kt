package com.example.leidy.myleagueapp.detailTeam

import com.example.domain.interactos.base.IUseCase
import com.example.domain.models.Events
import dagger.Module
import dagger.Provides


@Module
class DetailTeamActivityModule {

    @Provides
    fun provideDetailTeamPresenter(
            getEventsInteractor: IUseCase<Events, Int>
    ) : IDetailTeamContract.Presenter{
        return DetailTeamPresenter(
                getEventsInteractor
        )
    }
}