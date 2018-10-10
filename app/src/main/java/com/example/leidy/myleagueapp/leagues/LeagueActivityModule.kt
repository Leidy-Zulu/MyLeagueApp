package com.example.leidy.myleagueapp.leagues


import com.example.domain.interactos.base.IUseCase
import com.example.domain.models.Teams
import dagger.Module
import dagger.Provides


@Module
class LeagueActivityModule {

    @Provides
    fun provideLeaguePresenter(
          getLeagueInteractor: IUseCase<Teams, Int>
    ): ILeagueContract.Presenter {
        return LeaguePresenter(
                getLeagueInteractor
        )
    }
}