package com.example.leidy.myleagueapp.support

import android.support.test.espresso.Espresso
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.contrib.RecyclerViewActions
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.v7.widget.RecyclerView
import com.example.leidy.myleagueapp.R
import org.hamcrest.Matchers




fun validateExistView(resourceId: Int){
    Espresso.onView(Matchers.allOf(ViewMatchers.withId(resourceId), isDisplayed()))
}

fun isElementDisplayedInRecyclerView(
        recyclerId: Int,
        elementText: String
) {
    Espresso.onView(ViewMatchers.withId(recyclerId))
            .perform(
                    RecyclerViewActions.actionOnItem<RecyclerView.ViewHolder>(
                            ViewMatchers.hasDescendant(ViewMatchers.withSubstring(elementText)),
                            ViewActions.scrollTo()
                    )
            )
    Espresso.onView(ViewMatchers.withSubstring(elementText))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
}


fun wait(seconds: Int) {
    Thread.sleep(seconds.toLong() * 1000)
}

fun clickElementDisplayedInRecyclerView(
        recyclerId: Int,
        elementText: String
) {
    Espresso.onView(ViewMatchers.withId(recyclerId))
            .perform(
                    RecyclerViewActions.actionOnItem<RecyclerView.ViewHolder>(
                            ViewMatchers.hasDescendant(ViewMatchers.withSubstring(elementText)),
                            ViewActions.scrollTo()
                    )
            )
    Espresso.onView(ViewMatchers.withId(recyclerId))
            .perform(
                    RecyclerViewActions.actionOnItem<RecyclerView.ViewHolder>(
                            ViewMatchers.hasDescendant(ViewMatchers.withSubstring(elementText)),
                            ViewActions.click()
                    )
            )
}

fun openDetailTeam(){
    wait(10)
    clickElementDisplayedInRecyclerView(R.id.recyclerViewTeam, "Alaves")
}

fun isElementDisplayedInListView(resourceId: Int){
    Espresso.onView(withId(resourceId)).check(matches(isDisplayed()))
}


