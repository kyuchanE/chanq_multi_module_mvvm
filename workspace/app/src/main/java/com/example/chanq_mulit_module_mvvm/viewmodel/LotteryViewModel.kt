package com.example.chanq_mulit_module_mvvm.viewmodel

import androidx.lifecycle.viewModelScope
import com.example.chanq_mulit_module_mvvm.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.kyu.domain.model.LotteryResponse
import dev.kyu.domain.usecase.GetLotteryRepoUseCase
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LotteryViewModel @Inject constructor(
    private val getLotteryRepoUseCase: GetLotteryRepoUseCase
): BaseViewModel() {
    private val _lotteryRepo = MutableSharedFlow<LotteryResponse>()
    var lotteryRepo = _lotteryRepo.asSharedFlow()

    fun getLotteryRepo(drwNo: String) = viewModelScope.launch {
        val response = getLotteryRepoUseCase.execute(this@LotteryViewModel, drwNo)
        if (response == null) else {
            _lotteryRepo.emit(response)
        }
    }

}