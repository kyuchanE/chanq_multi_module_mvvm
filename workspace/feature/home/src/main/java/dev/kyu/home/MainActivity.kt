package dev.kyu.home

import dagger.hilt.android.AndroidEntryPoint
import dev.kyu.home.databinding.ActivityMainBinding
import dev.kyu.navigator.LotteryNavigator
import dev.kyu.navigator.UserNavigator
import dev.kyu.ui.BaseActivity
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val layoutId: Int = R.layout.activity_main

    @Inject
    lateinit var lotteryNavigator: LotteryNavigator
    @Inject
    lateinit var userNavigator: UserNavigator

    override fun initView() {

        binding.btnLottery.setOnClickListener {
            lotteryNavigator.navigateFrom(
                activity = this,
                withFinish = false,
            )
        }

        binding.btnRandomUser.setOnClickListener {
            userNavigator.navigateFrom(
                activity = this,
                withFinish = false,
            )
        }
    }

}