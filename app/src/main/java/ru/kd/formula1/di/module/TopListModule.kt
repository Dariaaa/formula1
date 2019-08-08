package ru.kd.formula1.di.module

import dagger.Module
import dagger.Provides
import ru.kd.formula1.toplist.TopListContract
import ru.kd.formula1.toplist.TopListPresenter
import javax.inject.Singleton

@Module
class TopListModule{

    @Provides
    fun providePresenter():TopListContract.Presenter{
        return TopListPresenter()
    }
}