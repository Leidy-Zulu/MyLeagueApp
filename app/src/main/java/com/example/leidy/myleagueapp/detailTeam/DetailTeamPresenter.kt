package com.example.leidy.myleagueapp.detailTeam

import android.util.Log
import com.example.domain.interactos.base.IUseCase
import com.example.domain.models.Events
import io.reactivex.disposables.CompositeDisposable

class DetailTeamPresenter(private val meEventsInteractor: IUseCase<Events, Int>) : IDetailTeamContract.Presenter {


    private var view: IDetailTeamContract.View? = null
    private val mSubscriptions = CompositeDisposable()

    override fun view(view: IDetailTeamContract.View) {
        this.view = view
    }

    override fun getEvents(idEvent: Int) {
        mSubscriptions.add(meEventsInteractor.execute(idEvent, {
            view?.showListEvent(it.events)
        }, {
            Log.i("ErrorPresenter", it.message)
        })

        )
    }
}