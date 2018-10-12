package com.example.data.mapper

import com.example.data.model.ApiEvents
import com.example.domain.models.Events
import io.reactivex.functions.Function

object ApiEventsMapper: Function<ApiEvents, Events> {
    override fun apply(t: ApiEvents): Events {
        return Events(
                t.events.map { ApiEventMapper.apply(it) }
        )
    }
}