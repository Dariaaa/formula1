package ru.kd.formula1.di.module

import dagger.Module
import dagger.Provides
import ru.kd.formula1.races.RacesContract
import ru.kd.formula1.races.RacesPresenter
import javax.inject.Singleton

@Module
class RacesModule{

    @Provides
    fun providePresenter():RacesContract.Presenter{
        return RacesPresenter()
    }
}