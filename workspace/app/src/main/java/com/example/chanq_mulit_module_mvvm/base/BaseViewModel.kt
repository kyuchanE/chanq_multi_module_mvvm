package com.example.chanq_mulit_module_mvvm.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dev.kyu.domain.utils.ErrorType
import dev.kyu.domain.utils.RemoteErrorEmitter
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch

abstract class BaseViewModel: ViewModel(), RemoteErrorEmitter {

    val mutableErrorMessage = MutableSharedFlow<String>()
    val mutableErrorType = MutableSharedFlow<ErrorType>()

    override fun onError(msg: String) {
        viewModelScope.launch {
            mutableErrorMessage.emit(msg)
        }
    }

    override fun onError(errorType: ErrorType) {
        viewModelScope.launch {
            mutableErrorType.emit(errorType)
        }
    }

}