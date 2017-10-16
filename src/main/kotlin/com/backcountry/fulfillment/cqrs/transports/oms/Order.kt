package com.backcountry.fulfillment.cqrs.transports.oms

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

data class Order @JsonCreator constructor(
        @JsonProperty("orderId") val orderId: String,
        @JsonProperty("customer") val customer: Customer,
        @JsonProperty("lines") val lines: List<OrderLine> = LinkedList()
)