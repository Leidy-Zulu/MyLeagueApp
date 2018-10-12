package com.example.repositories

import com.example.data.model.ApiTeam
import com.example.data.model.ApiTeams
import com.example.data.repositories.LeagueRepository
import com.example.data.service.ILeagueService
import com.example.domain.models.Teams
import com.example.domain.repositories.ILeagueRepository
import io.reactivex.Observable
import io.reactivex.observers.TestObserver
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
class LeagueRepositoryTest {

    private lateinit var mILeagueRepository: ILeagueRepository
    private lateinit var mTestObserver: TestObserver<Teams>

    @Mock
    lateinit var mILeagueService: ILeagueService

    @Before
    fun setUp(){
        mTestObserver = TestObserver()
        MockitoAnnotations.initMocks(this)
        mILeagueRepository = LeagueRepository(mILeagueService)
        Mockito.`when`(mILeagueService.getTeams(1))
                .thenReturn(Observable.just(ApiTeams(List(2){
                    ApiTeam(1,
                            "Team",
                            "stadium",
                            "teamBadge",
                            "jersery",
                            "year",
                            "Description",
                            "website",
                            "twitter",
                            "facebook",
                            "instagram",
                            null)
                })))
    }

    @Test
    fun getTeams(){
        mILeagueRepository.getTeams(1).subscribeWith(mTestObserver)
        mTestObserver.assertNoErrors().assertComplete()
    }
}