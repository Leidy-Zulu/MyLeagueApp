package com.example.domain.repositories

import com.example.domain.models.Events
import io.reactivex.Observable

interface IEventRepository {

    fun getEvents(codeEvent: Int): Observable<Events>
}