package ru.kd.formula1.api.entity

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class MRData(
    @JsonProperty("RaceTable")
    val raceTable: RaceTable,
    @JsonProperty("DriverTable")
    val driverTable: DriverTable
)