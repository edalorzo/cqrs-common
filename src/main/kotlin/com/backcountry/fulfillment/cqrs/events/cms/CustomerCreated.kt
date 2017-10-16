package com.backcountry.fulfillment.cqrs.events.cms

import com.backcountry.fulfillment.cqrs.commands.cms.CreateCustomer
import com.backcountry.fulfillment.cqrs.events.api.Event
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class CustomerCreated @JsonCreator constructor(
        @JsonProperty("email") val email: String,
        @JsonProperty("firstName") val firstName: String,
        @JsonProperty("lastName") val lastName: String) : Event {

    constructor(command: CreateCustomer) : this(
            command.email,
            command.firstName,
            command.lastName)

    override fun getRoutingKey() = "ffd.OrderCustomer.CustomerCreated"
}