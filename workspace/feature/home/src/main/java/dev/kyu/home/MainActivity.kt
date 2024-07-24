package dev.kyu.home

import android.content.Intent
import dev.kyu.home.databinding.ActivityMainBinding
import dev.kyu.ui.BaseActivity


class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val layoutId: Int = R.layout.activity_main

    override fun initView() {

//        binding.btnLottery.setOnClickListener {
//            Intent(this, LotteryInfoActivity::class.java).apply {
//                startActivity(this)
//            }
//        }
//
//        binding.btnRandomUser.setOnClickListener {
//            Intent(this, UserInfoActivity::class.java).apply {
//                startActivity(this)
//            }
//        }
    }

}