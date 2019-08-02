package ru.kd.formula1.driver

import android.content.Context


class DriverPresenter : DriverContract.Presenter {
    override fun loadDriverInfo(driverId: String?) {
        view.showDriver(DriverViewModel("Test", null))

    }

    private lateinit var view: DriverContract.View

    override fun getContext(): Context? = view.getAppContext()

    override fun attach(view: DriverContract.View) {
        this.view = view
    }

}