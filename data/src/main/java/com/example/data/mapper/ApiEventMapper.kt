package com.example.data.mapper

import com.example.data.model.ApiEvent
import com.example.domain.models.Event
import io.reactivex.functions.Function

object ApiEventMapper: Function<ApiEvent, Event> {
    override fun apply(t: ApiEvent): Event {
        return Event(
                t.strFilename
        )
    }


}