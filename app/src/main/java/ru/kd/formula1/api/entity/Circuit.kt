package ru.kd.formula1.api.entity

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Circuit(
    val circuitId: String, val url: String, val circuitName: String,
    @JsonProperty("Location") val location: Location
)