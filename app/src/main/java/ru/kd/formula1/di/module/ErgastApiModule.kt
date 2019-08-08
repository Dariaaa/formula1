package ru.kd.formula1.di.module

import dagger.Module
import dagger.Provides
import ru.kd.formula1.api.ErgastApiServiceInterface

@Module
class ErgastApiModule(private val ergastApiUrl:String){

    @Provides
    fun provideApiService():ErgastApiServiceInterface{
        return ErgastApiServiceInterface.create(ergastApiUrl)
    }
}