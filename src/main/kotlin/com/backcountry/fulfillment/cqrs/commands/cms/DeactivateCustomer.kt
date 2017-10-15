package com.backcountry.fulfillment.cqrs.commands.cms

import com.backcountry.fulfillment.cqrs.commands.api.Command
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class DeactivateCustomer @JsonCreator constructor(
        @JsonProperty("email") val email: String): Command