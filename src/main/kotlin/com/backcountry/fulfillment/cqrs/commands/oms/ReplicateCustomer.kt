package com.backcountry.fulfillment.cqrs.commands.oms

import com.backcountry.fulfillment.cqrs.commands.api.Command
import com.backcountry.fulfillment.cqrs.events.cms.CustomerCreated
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class ReplicateCustomer @JsonCreator constructor(
        @JsonProperty("email") val email: String,
        @JsonProperty("firstName") val firstName: String,
        @JsonProperty("lastName") val lastName: String
): Command {

    constructor(event: CustomerCreated): this(event.email, event.firstName, event.lastName)
}