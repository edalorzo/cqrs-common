package com.backcountry.fulfillment.cqrs.events.cms

import com.backcountry.fulfillment.cqrs.commands.cms.DeactivateCustomer
import com.backcountry.fulfillment.cqrs.events.api.Event
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class CustomerDeactivated @JsonCreator constructor(
        @JsonProperty("email") val email: String): Event {

    constructor(command: DeactivateCustomer): this(command.email)

    override fun getRoutingKey() = "ffd.Customer.CustomerDeactivated"
}