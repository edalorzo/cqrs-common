package com.backcountry.fulfillment.cqrs.events.api

interface EventHandler<in T> where T: Event {
    fun handle(event: T)
}