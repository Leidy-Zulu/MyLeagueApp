package com.example.leidy.myleagueapp.leagues


import android.support.test.rule.ActivityTestRule
import com.example.leidy.myleagueapp.R
import com.example.leidy.myleagueapp.support.clickElementDisplayedInRecyclerView
import com.example.leidy.myleagueapp.support.isElementDisplayedInRecyclerView
import com.example.leidy.myleagueapp.support.validateExistView
import com.example.leidy.myleagueapp.support.wait
import org.junit.Rule
import org.junit.Test

class LeagueTest {

    @get:Rule
    var activityTestRule = ActivityTestRule(LeagueActivity::class.java)

    @Test
    fun validateExistAItem(){
        wait(10)
        validateExistView(R.id.textViewName)
        validateExistView(R.id.textViewStadium)
        validateExistView(R.id.imageViewBadge)
        isElementDisplayedInRecyclerView(R.id.recyclerViewTeam, "Eibar")
    }

    @Test
    fun validateExistLeagueSearh(){
        validateExistView(R.id.cardViewSearh)
    }

    @Test
    fun goToDetailItem(){
        wait(10)
        clickElementDisplayedInRecyclerView(R.id.recyclerViewTeam, "Alaves")
    }


}