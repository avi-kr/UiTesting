package com.abhishek.uitesting.ui.login

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.Visibility
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withEffectiveVisibility
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.junit.Test
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.abhishek.uitesting.R

import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class LoginActivityTest {

    @Test
    fun testActivity_inView() {
        val activityScenario = ActivityScenario.launch(LoginActivity::class.java)

        onView(withId(R.id.login_container)).check(matches(isDisplayed()))
    }

    // Visibility
    @Test
    fun testVisibility_title_nextButton() {
        val activityScenario = ActivityScenario.launch(LoginActivity::class.java)

        onView(withId(R.id.login_title))
                .check(matches(isDisplayed())) // method 1

        onView(withId(R.id.login_title))
                .check(matches(withEffectiveVisibility(Visibility.VISIBLE))) // method 2

        onView(withId(R.id.login))
                .check(matches(isDisplayed()))
    }

    // Text
    @Test
    fun testTitleTextDisplayed() {
        val activityScenario = ActivityScenario.launch(LoginActivity::class.java)

        onView(withId(R.id.login_title))
                .check(matches(withText(R.string.login)))
    }

}
