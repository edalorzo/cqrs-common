package com.backcountry.fulfillment.cqrs.transports.oms

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class OrderLine @JsonCreator constructor(
        @JsonProperty("sku") val sku: String,
        @JsonProperty("price") val price: Double,
        @JsonProperty("quantity") val quantity: Int
)