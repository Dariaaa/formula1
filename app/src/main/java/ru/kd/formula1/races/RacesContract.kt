package ru.kd.formula1.races

import android.content.Context

interface RacesContract{
    interface View{
        fun showRaces(racesViewModel: RacesViewModel)
        fun attachPresenter(presenter:Presenter)
        fun getAppContext(): Context?
        fun showRaceResult(season: Int, round: Int)
    }
    interface Presenter{
        fun attach(view:View)
        fun loadRaces()
        fun loadRaceResult(season: Int, round: Int)
        fun getContext(): Context?
    }
}