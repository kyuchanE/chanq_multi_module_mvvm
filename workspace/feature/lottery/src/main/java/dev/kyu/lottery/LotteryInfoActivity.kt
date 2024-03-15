package dev.kyu.lottery

import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import dev.kyu.lottery.databinding.ActivityLotteryInfoBinding
import dev.kyu.ui.BaseActivity
import kotlinx.coroutines.launch

@AndroidEntryPoint
class LotteryInfoActivity : BaseActivity<ActivityLotteryInfoBinding>() {

    override val layoutId: Int
        get() = R.layout.activity_lottery_info

    private val lotteryViewModel by viewModels<LotteryViewModel>()

    override fun initView() {
        observeViewModel()

        binding.btnLottery.setOnClickListener {
            lotteryViewModel.getLotteryRepo(binding.etLottery.text.toString())
        }

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