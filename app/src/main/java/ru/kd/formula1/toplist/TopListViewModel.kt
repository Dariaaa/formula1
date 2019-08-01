package ru.kd.formula1.toplist

data class TopListViewModel(val list:List<TopListViewModelItem>)
data class TopListViewModelItem(val driverId:String,val driverName:String, val position:Int, val points:Int)