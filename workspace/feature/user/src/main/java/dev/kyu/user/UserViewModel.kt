package dev.kyu.user

import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.kyu.domain.model.RandomUserDomainData
import dev.kyu.domain.usecase.user.GetRandomUserUseCase
import dev.kyu.ui.BaseViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(
    private val getRandomUserUseCase: GetRandomUserUseCase
): BaseViewModel() {

    private val _userRepo = MutableSharedFlow<MutableList<RandomUserDomainData>>()
    var userRepo = _userRepo.asSharedFlow()

    fun getUserRepo(cntUser: Int) = viewModelScope.launch {
        getRandomUserUseCase.getRandomUserInfo(cntUser).onStart {

        }.catch {

        }.collectLatest {  userDataList ->
            userDataList?.let {
                _userRepo.emit(it)
            }
        }
    }

}