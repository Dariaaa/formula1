package ru.kd.formula1.races

import android.content.Context
import java.util.*

class RacesPresenter:RacesContract.Presenter{
    override fun getContext(): Context? = view.getAppContext()

    override fun loadRaceResult(season: Int, round: Int) {
        view.showRaceResult(season,round)
    }

    lateinit var view:RacesContract.View

    override fun attach(view: RacesContract.View) {
        this.view = view
    }

    override fun loadRaces(){
        val result =  RacesViewModel(listOf(RacesViewModelItem("test", Date(),"test",2019,1)))
        view.showRaces(result)
    }

}