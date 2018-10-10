package com.example.leidy.myleagueapp.detailTeam

import com.example.domain.interactos.base.IUseCase
import com.example.domain.models.Events
import io.reactivex.disposables.CompositeDisposable

class DetailTeamPresenter(eventsInteractor: IUseCase<Events, Int>) : IDetailTeamContract.Presenter {

    private var view: IDetailTeamContract.View? = null
    private val mSubscriptions = CompositeDisposable()

    override fun view(view: IDetailTeamContract.View) {
        this.view = view
    }
}