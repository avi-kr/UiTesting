package com.abhishek.uitesting

import androidx.lifecycle.Lifecycle
import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.abhishek.uitesting.R.id
import com.abhishek.uitesting.R.string
import org.junit.*
import org.junit.runner.*

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest {

    /**
     * ActivityScenarioRule:
     * https://developer.android.com/reference/androidx/test/ext/junit/rules/ActivityScenarioRule.html
     */
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testActivity_inView() {

        Espresso.onView(withId(id.main_container))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        // Notice this does not effect the next test
        activityRule.scenario.moveToState(Lifecycle.State.DESTROYED)
    }

    // Visibility
    @Test
    fun testVisibility_title_nextButton() {
        Espresso.onView(withId(id.main_title))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        Espresso.onView(withId(id.main_button_back))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    // Text
    @Test
    fun testTitleTextDisplayed() {
        Espresso.onView(withId(id.main_title))
            .check(ViewAssertions.matches(withText(string.welcome)))
    }

}