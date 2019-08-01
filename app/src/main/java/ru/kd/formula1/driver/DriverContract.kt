package ru.kd.formula1.driver

import android.content.Context

interface DriverContract{
    interface View{
        fun showDriver(driverViewModel: DriverViewModel)
        fun attachPresenter(presenter:Presenter)
        fun getAppContext(): Context?
    }
    interface Presenter{
        fun loadDriverInfo()
        fun attach(view: View)
        fun getContext(): Context?

    }
}