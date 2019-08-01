package ru.kd.formula1.races

import java.util.*

data class RacesViewModel(val list:List<RacesViewModelItem>)
data class RacesViewModelItem(val raceName:String, val raceDate:Date, val circuitName:String, val season:Int, val round:Int)