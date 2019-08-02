package ru.kd.formula1.races


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_races.*
import ru.kd.formula1.R


class RacesFragment : Fragment(), RacesContract.View {

    private lateinit var presenter: RacesContract.Presenter

    override fun showRaceResult(season: Int, round: Int) {
        //todo show topListFragment
    }

    override fun getAppContext(): Context? = context

    override fun attachPresenter(presenter: RacesContract.Presenter) {
        this.presenter = presenter
    }

    override fun showRaces(racesViewModel: RacesViewModel) {
        val adapter = RacesListAdapter(racesViewModel.list,presenter)
        racesResultListView!!.layoutManager = LinearLayoutManager(activity)
        racesResultListView!!.adapter = adapter
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val presenter = RacesPresenter()
        presenter.attach(this)
        attachPresenter(presenter)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (savedInstanceState==null){
            presenter.loadRaces()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_races, container, false)
    }


}
