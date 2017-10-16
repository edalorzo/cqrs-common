package com.backcountry.fulfillment.cqrs.events.cms

import com.backcountry.fulfillment.cqrs.commands.cms.ActivateCustomer
import com.backcountry.fulfillment.cqrs.events.api.Event
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class CustomerActivated @JsonCreator constructor(
        @JsonProperty("email") val email: String): Event {

    constructor(command: ActivateCustomer): this(command.email)

    override fun getRoutingKey() = "ffd.OrderCustomer.CustomerActivated"
}
