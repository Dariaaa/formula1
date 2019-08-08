package ru.kd.formula1.di.component

import dagger.Component
import ru.kd.formula1.di.module.DriverModule
import ru.kd.formula1.driver.DriverContract

@Component(
    modules = [DriverModule::class]
)
interface DriverComponent{

    fun getPresenter():DriverContract.Presenter
}