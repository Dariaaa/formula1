package ru.kd.formula1.toplist

import android.content.Context

class TopListPresenter:TopListContract.Presenter{
    private lateinit var view: TopListContract.View

    override fun loadDriverInfo(driverId: String) {
        view.showDriverInfo(driverId)
    }

    override fun getContext(): Context?  = this.view.getAppContext()

    override fun attach(view: TopListContract.View) {
        this.view = view
    }

    override fun loadTopList() {
        val result =  TopListViewModel(listOf(TopListViewModelItem(
            "test", "test",1,50)))
        view.showTopList(result)
    }

}
