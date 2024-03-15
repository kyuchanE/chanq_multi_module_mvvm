package dev.kyu.lottery

import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.kyu.domain.model.LotteryData
import dev.kyu.domain.usecase.lottery.GetLotteryRepoUseCase
import dev.kyu.ui.BaseViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LotteryViewModel @Inject constructor(
    private val getLotteryRepoUseCase: GetLotteryRepoUseCase
): BaseViewModel() {

    private val _lotteryRepo = MutableSharedFlow<LotteryData>()
    var lotteryRepo = _lotteryRepo.asSharedFlow()

    fun getLotteryRepo(drwNo: String) = viewModelScope.launch {
        getLotteryRepoUseCase(drwNo).onStart {

        }.catch {

        }.collectLatest { lotteryData ->
            lotteryData?.let {
                _lotteryRepo.emit(it)
            }
        }
    }

}