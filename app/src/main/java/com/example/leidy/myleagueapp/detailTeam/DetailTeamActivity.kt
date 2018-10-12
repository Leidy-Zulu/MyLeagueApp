package com.example.leidy.myleagueapp.detailTeam

import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.domain.models.Event
import com.example.domain.models.Team
import com.example.leidy.myleagueapp.R
import com.example.leidy.myleagueapp.utils.TEAM
import com.squareup.picasso.Picasso
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_league_detail.*
import javax.inject.Inject

class DetailTeamActivity : DaggerAppCompatActivity(), IDetailTeamContract.View {


    @Inject
    lateinit var mPresenter: IDetailTeamContract.Presenter
    lateinit var team: Team

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league_detail)
        mPresenter.view(this)
        team = intent.getParcelableExtra(TEAM)
        mPresenter.getEvents(team.id)
        loadData()
    }

    private fun loadData() {
        Picasso.get().load(team.badge).into(imageViewBadge)
        Picasso.get().load(team.jersey).into(imageViewJersey)
        textViewName.text = "${team.name} - ${team.formedYear}"
        textViewDescription.text = team.descripcion
    }


    override fun showListEvent(events: List<Event>) {
       var arrayAdapter: ArrayAdapter<String> = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getItemsArrayFromListEvent(events))
        listViewEvents.adapter = arrayAdapter
    }

    private fun getItemsArrayFromListEvent(eventArrayList: List<Event>): Array<String?> {
        val items = arrayOfNulls<String>(eventArrayList.size)
        for (i in 0 until eventArrayList.size) {
            items[i] = eventArrayList[i].description
        }
        return items
    }

}