package com.backcountry.fulfillment.cqrs.events.api

import com.fasterxml.jackson.annotation.JsonIgnore

interface Event {

    @JsonIgnore
    fun getRoutingKey(): String

}