package com.example.domain.interactos.base

import com.example.domain.baseinteractor.interactos.IUseCase
import com.example.domain.baseinteractor.interactos.UseCase
import com.example.domain.models.Event
import com.example.domain.repositories.ILeagueRepository
import io.reactivex.Observable
import io.reactivex.disposables.Disposable

class GetEventsInteractor(private val mILeagueRepository: ILeagueRepository) : UseCase<Event, Int>() {

    override fun buildUseCase(params: Int): Observable<Event> {
        return mILeagueRepository.getEvents(params)
    }

}
