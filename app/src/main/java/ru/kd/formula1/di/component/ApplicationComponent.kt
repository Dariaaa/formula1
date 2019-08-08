package ru.kd.formula1.di.component

import dagger.Component
import ru.kd.formula1.api.ErgastApiServiceInterface
import ru.kd.formula1.di.module.ErgastApiModule

@Component(
    modules = [ErgastApiModule::class]
)
interface ApplicationComponent {

    fun getErgastApiService(): ErgastApiServiceInterface

}