package com.backcountry.fulfillment.cqrs.commands.oms

import com.backcountry.fulfillment.cqrs.commands.api.Command
import com.backcountry.fulfillment.cqrs.transports.oms.Order
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class PlaceOrder @JsonCreator constructor(
        @JsonProperty("order") val order: Order
): Command


