package ru.kd.formula1.api.entity

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties
data class Location(val lat:Double,val long:Double,val locality:String,val country:String)