package dev.kyu.home.navigator

import android.app.Activity
import android.content.Intent
import dev.kyu.home.MainActivity
import dev.kyu.navigator.MainNavigator
import dev.kyu.ui.utils.startActivityWithAnimation
import javax.inject.Inject

class MainNavigatorImpl @Inject constructor(): MainNavigator {

    override fun navigateFrom(
        activity: Activity,
        intentBuilder: Intent.() -> Intent,
        withFinish: Boolean
    ) {
        activity.startActivityWithAnimation<MainActivity>(
            intentBuilder = intentBuilder,
            withFinish = withFinish,
        )
    }

}