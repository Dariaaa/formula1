package ru.kd.formula1.di.component

import dagger.Component
import ru.kd.formula1.di.module.RacesModule
import ru.kd.formula1.races.RacesContract

@Component(
    modules = [RacesModule::class]
)
interface RacesComponent{

    fun getPresenter():RacesContract.Presenter
}