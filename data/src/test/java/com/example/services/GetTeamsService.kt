package com.example.services

import com.example.BaseTest
import com.example.Response.teamsSuccessResponse
import com.example.data.model.ApiTeams
import com.example.data.service.ILeagueService
import com.example.domain.models.Teams
import io.reactivex.observers.TestObserver
import okhttp3.mockwebserver.MockWebServer
import org.junit.Test

class GetTeamsService: BaseTest<ILeagueService> {

    override var mMockWebServer: MockWebServer? = null
    override var service: ILeagueService? = null
    override var type: Class<ILeagueService> = ILeagueService::class.java

    @Test
    fun shouldGetLeagues(){
        mMockWebServer?.enqueue(teamsSuccessResponse)
        val testObserver = TestObserver<ApiTeams>()
        service?.getTeams(1)?.subscribeWith(testObserver)
        testObserver.assertNoErrors()
    }

}