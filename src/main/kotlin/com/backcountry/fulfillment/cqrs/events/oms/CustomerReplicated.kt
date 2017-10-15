package com.backcountry.fulfillment.cqrs.events.oms

import com.backcountry.fulfillment.cqrs.commands.oms.ReplicateCustomer
import com.backcountry.fulfillment.cqrs.events.api.Event
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class CustomerReplicated @JsonCreator constructor(
        @JsonProperty("email") val email: String,
        @JsonProperty("firstName") val firstName: String,
        @JsonProperty("lastName") val lastName: String) : Event {

    constructor(command: ReplicateCustomer): this(command.email, command.firstName, command.lastName)

    override fun getRoutingKey() = "ffd.Orders.CustomerReplicated"
}