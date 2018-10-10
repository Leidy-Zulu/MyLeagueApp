package com.example.leidy.myleagueapp.leagues

import android.util.Log
import com.example.domain.baseinteractor.interactos.IUseCase
import com.example.domain.models.Teams
import io.reactivex.disposables.CompositeDisposable

class LeaguePresenter(private val mLeagueInteractor: IUseCase<Teams, Int>) : ILeagueContract.Presenter {


    private var view: ILeagueContract.View? = null
    private val mSubscriptions = CompositeDisposable()

    override fun view(view: ILeagueContract.View) {
        this.view = view
    }

    override fun getTeams(codeTeam: Int) {
        mSubscriptions.add(mLeagueInteractor.execute(codeTeam, {
            view?.showListTeam(it.teams)
        }, {
            Log.i("ErrorPresenter", it.message)
        })

        )

    }
}