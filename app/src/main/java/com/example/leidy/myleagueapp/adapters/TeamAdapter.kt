package com.example.leidy.myleagueapp.adapters

import com.example.leidy.myleagueapp.R.id.cardViewTeam
import com.example.leidy.myleagueapp.R.id.textViewStadium
import com.example.leidy.myleagueapp.R.id.textViewName
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import com.squareup.picasso.Picasso
import com.example.domain.models.Team
import android.view.View
import android.view.ViewGroup
import com.example.leidy.myleagueapp.R
import kotlinx.android.synthetic.main.item_team.view.*


class TeamAdapter(private val iItemListener: IItemListener, private val teamArrayList: List<Team>) : RecyclerView.Adapter<TeamAdapter.CustomViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, position: Int): CustomViewHolder {
        return CustomViewHolder(LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.item_team, viewGroup, false))
    }

    override fun onBindViewHolder(customViewHolder: CustomViewHolder, position: Int) {
        customViewHolder.bindView(teamArrayList[position])
    }


    override fun getItemCount(): Int {
        return teamArrayList.size
    }


    inner class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bindView(team: Team) {

            Picasso.get().load(team.badge).into(itemView.imageViewBadge)
            itemView.textViewName.text = team.name
            itemView.textViewStadium.text = team.stadium
            itemView.cardViewTeam.setOnClickListener {
                iItemListener.itemClick(team)
            }
        }

    }
}