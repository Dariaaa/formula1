package ru.kd.formula1.driver

import android.content.Context


class DriverPresenter:DriverContract.Presenter{
    override fun getContext(): Context? = view.getAppContext()

    private lateinit var view:DriverContract.View

    override fun loadDriverInfo() {
        view.showDriver(DriverViewModel("Test",null))
    }

    override fun attach(view: DriverContract.View) {
        this.view = view
    }

}