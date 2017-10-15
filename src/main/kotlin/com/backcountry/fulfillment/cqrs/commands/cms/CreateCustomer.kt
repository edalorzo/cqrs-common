package com.backcountry.fulfillment.cqrs.commands.cms

import com.backcountry.fulfillment.cqrs.commands.api.Command
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class CreateCustomer @JsonCreator constructor(
        @JsonProperty("email") val email: String,
        @JsonProperty("firstName") val firstName: String,
        @JsonProperty("lastName") val lastName: String
): Command