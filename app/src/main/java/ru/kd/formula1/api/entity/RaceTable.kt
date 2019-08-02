package ru.kd.formula1.api.entity

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties
data class RaceTable(
    @JsonProperty("Races") val list: List<Race>
)