package ru.kd.formula1.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import ru.kd.formula1.driver.DriverContract
import ru.kd.formula1.driver.DriverPresenter
import ru.kd.formula1.races.RacesContract
import ru.kd.formula1.races.RacesPresenter
import ru.kd.formula1.toplist.TopListContract
import ru.kd.formula1.toplist.TopListPresenter
import javax.inject.Singleton

@Module
class ViewModule(){

    @Provides
    fun provideRacesPresenter():RacesContract.Presenter{
        return RacesPresenter()
    }
    @Provides
    fun provideTopListPresenter():TopListContract.Presenter{
        return TopListPresenter()
    }
    @Provides
    fun privideDriverInfoPresenter():DriverContract.Presenter{
        return DriverPresenter()
    }

}