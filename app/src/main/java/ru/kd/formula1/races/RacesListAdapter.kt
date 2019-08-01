package ru.kd.formula1.races

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import ru.kd.formula1.R
import java.text.SimpleDateFormat

class RacesListAdapter(private val list:List<RacesViewModelItem>,
                       private val presenter:RacesContract.Presenter)
    : RecyclerView.Adapter<RacesListAdapter.ListViewHolder>() {


    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val race = list[position]

        holder.bind(race)

        holder.layout!!.setOnClickListener {
            presenter.loadRaceResult(race.season,race.round)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val itemView = LayoutInflater.from(presenter.getContext()).inflate(R.layout.item_race, parent, false)
        return ListViewHolder(itemView)
    }


    class ListViewHolder(view:View): RecyclerView.ViewHolder(view){
        var layout = itemView.findViewById<CardView>(R.id.item_layout)
        var title = layout.findViewById<TextView>(R.id.item_title)
        var num = layout.findViewById<TextView>(R.id.item_num)
        var descr = layout.findViewById<TextView>(R.id.item_descr)


        fun bind(item: RacesViewModelItem) {
            title.text = item.raceName
            num.text = SimpleDateFormat("dd.MM.yy").format(item.raceDate)
            descr.text = item.circuitName
            //todo add another race fields
        }

    }
}