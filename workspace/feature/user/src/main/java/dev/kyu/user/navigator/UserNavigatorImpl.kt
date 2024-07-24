package dev.kyu.user.navigator

import android.app.Activity
import android.content.Intent
import dev.kyu.navigator.UserNavigator
import dev.kyu.ui.utils.startActivityWithAnimation
import dev.kyu.user.UserInfoActivity
import javax.inject.Inject

class UserNavigatorImpl @Inject constructor(): UserNavigator {

    override fun navigateFrom(
        activity: Activity,
        intentBuilder: Intent.() -> Intent,
        withFinish: Boolean
    ) {
        activity.startActivityWithAnimation<UserInfoActivity>(
            intentBuilder = intentBuilder,
            withFinish = withFinish,
        )
    }

}