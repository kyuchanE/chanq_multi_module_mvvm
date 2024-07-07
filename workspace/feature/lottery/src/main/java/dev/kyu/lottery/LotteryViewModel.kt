package dev.kyu.lottery

import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.kyu.domain.model.LotteryData
import dev.kyu.domain.usecase.lottery.GetLotteryRepoUseCase
import dev.kyu.ui.BaseViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LotteryViewModel @Inject constructor(
    private val getLotteryRepoUseCase: GetLotteryRepoUseCase
): BaseViewModel() {

    private val _lotteryRepo = MutableSharedFlow<LotteryData>()
    var lotteryRepo = _lotteryRepo.asSharedFlow()

    private val _loadingState: MutableStateFlow<Boolean> = MutableStateFlow(false)
    var loadingState: StateFlow<Boolean> = _loadingState.asStateFlow()

    fun getLotteryRepo(drwNo: String) = viewModelScope.launch {
        _loadingState.update { true }
        getLotteryRepoUseCase(drwNo).onStart {

        }.catch {
            _loadingState.update { false }

        }.collectLatest { lotteryData ->
            lotteryData?.let {
                _loadingState.update { false }
                _lotteryRepo.emit(it)
            }
        }
    }

}