package dev.kyu.lottery.navigator

import android.app.Activity
import android.content.Intent
import dev.kyu.lottery.LotteryInfoActivity
import dev.kyu.navigator.LotteryNavigator
import dev.kyu.ui.utils.startActivityWithAnimation
import javax.inject.Inject

class LotteryNavigatorImpl @Inject constructor(): LotteryNavigator {

    override fun navigateFrom(
        activity: Activity,
        intentBuilder: Intent.() -> Intent,
        withFinish: Boolean
    ) {
        activity.startActivityWithAnimation<LotteryInfoActivity>(
            intentBuilder = intentBuilder,
            withFinish = withFinish,
        )
    }

}