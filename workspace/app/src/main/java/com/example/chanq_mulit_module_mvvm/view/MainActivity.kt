package com.example.chanq_mulit_module_mvvm.view

import android.view.View
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.chanq_mulit_module_mvvm.R
import com.example.chanq_mulit_module_mvvm.base.BaseActivity
import com.example.chanq_mulit_module_mvvm.databinding.ActivityMainBinding
import com.example.chanq_mulit_module_mvvm.viewmodel.LotteryViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {

    private val lotteryViewModel by viewModels<LotteryViewModel>()
    override val layoutId: Int = R.layout.activity_main

    override fun initView() {
        binding.activity = this
        observeViewModel()
    }

    fun clickLotteryBtn(view: View) {
        lotteryViewModel.getLotteryRepo(binding.etLottery.text.toString())
    }

    private fun observeViewModel() {
        lifecycleScope.launch {
            lotteryViewModel.lotteryRepo.collect {
                binding.tvLottery.text = "${it.drwtNo1} + ${it.drwtNo2} + " +
                        "${it.drwtNo3}+ ${it.drwtNo4} + ${it.drwtNo5} + ${it.drwtNo6}"
            }
        }
    }
}