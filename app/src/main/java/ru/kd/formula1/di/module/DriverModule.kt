package ru.kd.formula1.di.module

import dagger.Module
import dagger.Provides
import ru.kd.formula1.driver.DriverContract
import ru.kd.formula1.driver.DriverPresenter
import javax.inject.Singleton

@Module
class DriverModule{

    @Provides
    fun providePresenter():DriverContract.Presenter{
        return DriverPresenter()
    }
}