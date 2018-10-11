package com.example.leidy.myleagueapp.leagues

import android.support.test.rule.ActivityTestRule
import com.example.leidy.myleagueapp.R
import com.example.leidy.myleagueapp.detailTeam.DetailTeamActivity
import com.example.leidy.myleagueapp.support.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class DetailTeamTest {

    @get:Rule
    var activityTestRule = ActivityTestRule(LeagueActivity::class.java)



    @Test
    fun validateExistTextComponents(){
        openDetailTeam()
        validateExistView(R.id.textViewDescription)
        validateExistView(R.id.textViewName)
    }

    @Test
    fun validateExistImageComponents(){
        openDetailTeam()
        validateExistView(R.id.imageViewBadge)
        validateExistView(R.id.imageViewFacebook)
        validateExistView(R.id.imageViewInstagram)
        validateExistView(R.id.imageViewJersey)
        validateExistView(R.id.imageViewTwitter)
        validateExistView(R.id.imageViewWebSite)
        validateExistView(R.id.imageViewYoutube)
    }

    @Test
    fun validateExisteAnEvent(){
        openDetailTeam()
        isElementDisplayedInListView(R.id.listViewEvents)
    }



}