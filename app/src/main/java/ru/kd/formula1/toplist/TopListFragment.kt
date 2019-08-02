package ru.kd.formula1.toplist


import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_races.*
import ru.kd.formula1.R
import ru.kd.formula1.races.RacesListAdapter

class TopListFragment : Fragment(), TopListContract.View {

    private lateinit var presenter: TopListContract.Presenter

    override fun showTopList(topListViewModel: TopListViewModel) {
        val adapter = TopListAdapter(topListViewModel.list, presenter)
        racesResultListView!!.layoutManager = LinearLayoutManager(activity)
        racesResultListView!!.adapter = adapter
    }

    override fun showDriverInfo(driverId: String) {
        val bundle = bundleOf("driver_id" to driverId)
        findNavController().navigate(R.id.action_show_driver_info,bundle)
    }

    override fun attachPresenter(presenter: TopListContract.Presenter) {
        this.presenter = presenter
    }

    override fun getAppContext(): Context? = context

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (arguments == null) {
            Log.d(TAG, "params null")
            return
        }
        val season = arguments?.getInt("season")
        val round = arguments?.getInt("round")
        Log.d(TAG,"season $season round $round")
        presenter.loadTopList(season, round)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val presenter = TopListPresenter()
        presenter.attach(this)
        attachPresenter(presenter)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_top_list, container, false)
    }

    private val TAG = "TopListFragment"
}
