package ru.kd.formula1

import android.app.Application
import ru.kd.formula1.di.component.ApplicationComponent
import ru.kd.formula1.di.component.DaggerApplicationComponent
import ru.kd.formula1.di.module.DriverModule
import ru.kd.formula1.di.module.ErgastApiModule
import ru.kd.formula1.di.module.RacesModule
import ru.kd.formula1.di.module.TopListModule

class BaseApp:Application(){

    lateinit var component: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        setup()
    }

    fun setup() {
        val ergastApiUrl = applicationContext.resources.getString(R.string.ergast_api_url)

        component = DaggerApplicationComponent.builder()
            .ergastApiModule(ErgastApiModule(ergastApiUrl))
            .racesModule(RacesModule())
            .topListModule(TopListModule())
            .driverModule(DriverModule())
            .build()
    }

    companion object {
        lateinit var instance: BaseApp private set
    }
}