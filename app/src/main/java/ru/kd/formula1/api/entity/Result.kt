package ru.kd.formula1.api.entity

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Result(
    val position: Int, val positionText: String, val points: Int,
    val grid: Int, val laps: Int, val status: String,
    @JsonProperty("Time") val time: ResultTime?,
    @JsonProperty("Driver") val driver: Driver,
    @JsonProperty("Constructor") val constr:Constructor,
    @JsonProperty("FastestLap") val fastestLap: FastestLap
)
