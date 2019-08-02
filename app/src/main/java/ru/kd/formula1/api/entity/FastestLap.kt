package ru.kd.formula1.api.entity

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class FastestLap(val rank:Int,val lap:Int, val time:String,
                      @JsonProperty("AverageSpeed") val averageSpeed: AverageSpeed)