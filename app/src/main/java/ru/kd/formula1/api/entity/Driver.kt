package ru.kd.formula1.api.entity

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.util.*

@JsonIgnoreProperties(ignoreUnknown = true)
data class Driver(val driverId:String, val permanentNumber:Int, val code:String, val url:String,
                  val givenName:String,val dateOfBirth:Date, val nationality:String)