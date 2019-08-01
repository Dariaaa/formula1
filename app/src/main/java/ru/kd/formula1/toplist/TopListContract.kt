package ru.kd.formula1.toplist

import android.content.Context

interface TopListContract{
    interface View{
        fun showTopList(topListViewModel: TopListViewModel)
        fun showDriverInfo(driverId:String)
        fun attachPresenter(presenter:Presenter)
        fun getAppContext(): Context?
    }
    interface Presenter{
        fun loadTopList()
        fun loadDriverInfo(driverId: String)
        fun getContext(): Context?
        fun attach(view:View)

    }
}