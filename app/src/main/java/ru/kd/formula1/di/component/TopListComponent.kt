package ru.kd.formula1.di.component

import dagger.Component
import ru.kd.formula1.di.module.TopListModule
import ru.kd.formula1.toplist.TopListContract

@Component(
    modules = [TopListModule::class]
)
interface TopListComponent{

    fun getPresenter():TopListContract.Presenter
}