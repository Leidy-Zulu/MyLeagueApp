package com.example.services

import com.example.BaseTest
import com.example.Response.eventsSuccessResponse
import com.example.data.model.ApiEvents
import com.example.data.service.IEventService
import io.reactivex.observers.TestObserver
import okhttp3.mockwebserver.MockWebServer
import org.junit.Test

class GetEventsService: BaseTest<IEventService> {


    override var mMockWebServer: MockWebServer? = null
    override var service: IEventService? = null
    override var type: Class<IEventService> = IEventService::class.java

    @Test
    fun shouldGetEvents(){
        mMockWebServer?.enqueue(eventsSuccessResponse)
        val testObserver = TestObserver<ApiEvents>()
        service?.getEvents(1)?.subscribeWith(testObserver)
        testObserver.assertNoErrors()
    }



}