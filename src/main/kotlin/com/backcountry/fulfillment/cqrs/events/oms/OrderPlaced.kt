package com.backcountry.fulfillment.cqrs.events.oms

import com.backcountry.fulfillment.cqrs.commands.oms.PlaceOrder
import com.backcountry.fulfillment.cqrs.events.api.Event
import com.backcountry.fulfillment.cqrs.transports.oms.Order
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class OrderPlaced @JsonCreator constructor(
        @JsonProperty("order") val order: Order
): Event {

    constructor(command: PlaceOrder): this(command.order)

    override fun getRoutingKey() = "ffd.Orders.OrderPlaced"

}