package com.example.data.repositories

import com.example.data.mapper.ApiEventsMapper
import com.example.data.service.IEventService
import com.example.domain.models.Events
import com.example.domain.repositories.IEventRepository
import io.reactivex.Observable

class EventRepository(private val mIEventService: IEventService) : IEventRepository {

    override fun getEvents(codeEvent: Int): Observable<Events> {
        return mIEventService.getEvents(codeEvent).map{
            ApiEventsMapper.apply(it)
        }
    }
}