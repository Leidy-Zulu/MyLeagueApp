package com.example.domain.interactos


import com.example.domain.interactos.base.UseCase
import com.example.domain.models.Teams
import com.example.domain.repositories.ILeagueRepository
import io.reactivex.Observable

class GetLeaguesInteractor(private val mLeagueRepository: ILeagueRepository) : UseCase<Teams, Int>() {


    override fun buildUseCase(params: Int): Observable<Teams> {
        return mLeagueRepository.getTeams(params)
    }
}