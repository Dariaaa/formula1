package ru.kd.formula1.api.entity

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

@JsonIgnoreProperties(ignoreUnknown = true)
data class Race(
    val season: Int, val round: Int, val url: String, val raceName: String, val date: Date,
    @JsonProperty("Circuit") val circuit: Circuit,
    @JsonProperty("Results") val results: List<Result>?
): Comparable<Race>{
    override fun compareTo(other: Race): Int {
        return when {
            this.round==other.round -> 0
            this.round>other.round -> -1
            else -> 1
        }

    }

}