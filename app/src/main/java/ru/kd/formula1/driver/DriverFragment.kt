package ru.kd.formula1.driver


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_driver.*
import ru.kd.formula1.R


class DriverFragment : Fragment(), DriverContract.View {

    private lateinit var presenter: DriverContract.Presenter

    override fun showDriver(driverViewModel: DriverViewModel) {
        if (driverViewModel.pic!=null) {
            driverPic.setImageBitmap(driverViewModel.pic)
        }
        driverName.text = driverViewModel.name
    }

    override fun getAppContext(): Context? = context

    override fun attachPresenter(presenter: DriverContract.Presenter) {
        this.presenter = presenter
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (savedInstanceState == null) {
            presenter.loadDriverInfo()
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val presenter = DriverPresenter()
        presenter.attach(this)
        attachPresenter(presenter)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_driver, container, false)
    }


}
