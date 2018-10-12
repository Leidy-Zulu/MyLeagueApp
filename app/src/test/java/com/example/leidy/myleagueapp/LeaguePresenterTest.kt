package com.example.leidy.myleagueapp

import com.example.domain.interactos.base.UseCase
import com.example.domain.models.Team
import com.example.domain.models.Teams
import com.example.leidy.myleagueapp.leagues.ILeagueContract
import com.example.leidy.myleagueapp.leagues.LeaguePresenter
import io.reactivex.Observable
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(MockitoJUnitRunner::class)
class LeaguePresenterTest {


    @Mock
    private lateinit var mIUseCase: UseCase<Teams, Int>

    @Mock
    private lateinit var mILeagueContractView: ILeagueContract.View

    private lateinit var mLeaguePresenter: ILeagueContract.Presenter

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        mLeaguePresenter = LeaguePresenter(mIUseCase)
        mLeaguePresenter.view(mILeagueContractView)

        doReturn(Observable.just(Teams(listOf(Team(1,
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
                null))))).`when`(mIUseCase)
                .buildUseCase(1)
    }


    @Test
    fun additionIsCorrect() {
        mLeaguePresenter.getTeams(1)
        verify(mILeagueContractView).showListTeam(listOf(Team(1,
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
                null)))
    }
}
