package com.codingwithmitch.espressouitestexamples.ui.main

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.abhishek.uitesting.R
import com.abhishek.uitesting.ui.login.LoginActivity
import org.junit.Test

import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class LoginActivityTest{

    @Test
    fun test_navSecondaryActivity() {

        val activityScenario = ActivityScenario.launch(LoginActivity::class.java)

        onView(withId(R.id.loginCall)).perform(click())

//        onView(withId(R.id.main_container)).check(matches(isDisplayed()))
    }

    /**
     * Test both ways to navigate from SecondaryActivity to MainActivity
     */
    @Test
    fun test_backPress_toMainActivity() {

        val activityScenario = ActivityScenario.launch(LoginActivity::class.java)

        onView(withId(R.id.loginCall)).perform(click())

//        onView(withId(R.id.main_container)).check(matches(isDisplayed()))

//        onView(withId(R.id.main_button_back)).perform(click()) // method 1

//        onView(withId(R.id.login_container)).check(matches(isDisplayed()))

//        onView(withId(R.id.loginCall)).perform(click())

//        pressBack() // method 2

//        onView(withId(R.id.login_container)).check(matches(isDisplayed()))
    }
}
















