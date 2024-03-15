package com.example.chanq_mulit_module_mvvm.view

import android.content.Intent
import com.example.chanq_mulit_module_mvvm.R
import dev.kyu.ui.BaseActivity
import com.example.chanq_mulit_module_mvvm.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import dev.kyu.lottery.LotteryInfoActivity
import dev.kyu.user.UserInfoActivity


class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val layoutId: Int = R.layout.activity_main

    override fun initView() {

        binding.btnLottery.setOnClickListener {
            Intent(this, LotteryInfoActivity::class.java).apply {
                startActivity(this)
            }
        }

        binding.btnRandomUser.setOnClickListener {
            Intent(this, UserInfoActivity::class.java).apply {
                startActivity(this)
            }
        }
    }

}