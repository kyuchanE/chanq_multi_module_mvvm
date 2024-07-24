package dev.kyu.navigator

import android.app.Activity
import android.content.Intent

interface Navigator {
    fun navigateFrom(
        activity: Activity,
        intentBuilder: Intent.() -> Intent = { this },
        withFinish: Boolean = false,
    )
}

interface MainNavigator: Navigator

interface LotteryNavigator: Navigator

interface UserNavigator: Navigator