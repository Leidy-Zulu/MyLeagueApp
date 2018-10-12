package com.example.repositories

import com.example.data.model.ApiEvent
import com.example.data.model.ApiEvents
import com.example.data.repositories.EventRepository
import com.example.data.service.IEventService
import com.example.domain.models.Events
import com.example.domain.repositories.IEventRepository
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
class EventRepositoryTest {

    private lateinit var mIEventRepository: IEventRepository
    private lateinit var mTestObserver: TestObserver<Events>

    @Mock
    lateinit var mIEventService: IEventService

    @Before
    fun setup(){
        mTestObserver = TestObserver()
        MockitoAnnotations.initMocks(this)
        mIEventRepository = EventRepository(mIEventService)
        Mockito.`when`(mIEventService.getEvents(1))
                .thenReturn(Observable.just(ApiEvents(List(5){
                    ApiEvent("Description")
                })))
    }

    @Test
    fun getEvents(){
        mIEventRepository.getEvents(1).subscribeWith(mTestObserver)
        mTestObserver.assertNoErrors().assertComplete()
    }
}