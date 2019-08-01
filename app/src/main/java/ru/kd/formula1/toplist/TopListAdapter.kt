package ru.kd.formula1.toplist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import ru.kd.formula1.R

class TopListAdapter(private val list:List<TopListViewModelItem>,
                     private val presenter:TopListContract.Presenter): RecyclerView.Adapter<TopListAdapter.ListViewHolder>() {

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val driver = list[position]

        holder.bind(driver)

        holder.layout!!.setOnClickListener {
            presenter.loadDriverInfo(driver.driverId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val itemView = LayoutInflater.from(presenter.getContext()).inflate(R.layout.item_race_result, parent, false)
        return ListViewHolder(itemView)
    }

    class ListViewHolder(view: View): RecyclerView.ViewHolder(view){
        var layout = itemView.findViewById<CardView>(R.id.top_list_item_layout)
        var title = layout.findViewById<TextView>(R.id.item_title)
        var num = layout.findViewById<TextView>(R.id.item_num)
        var descr = layout.findViewById<TextView>(R.id.item_descr)


        fun bind(item: TopListViewModelItem) {
            title.text = item.driverName
            num.text = item.position.toString()
            descr.text = item.points.toString()
            //todo add another race fields
        }

    }
}