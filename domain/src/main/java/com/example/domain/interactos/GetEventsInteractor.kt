package com.example.domain.interactos


import com.example.domain.interactos.base.UseCase
import com.example.domain.models.Events
import com.example.domain.repositories.IEventRepository
import com.example.domain.repositories.ILeagueRepository
import io.reactivex.Observable

class GetEventsInteractor(private val mIEventRepository: IEventRepository) : UseCase<Events, Int>() {

    override fun buildUseCase(params: Int): Observable<Events> {
        return mIEventRepository.getEvents(params)
    }

}
