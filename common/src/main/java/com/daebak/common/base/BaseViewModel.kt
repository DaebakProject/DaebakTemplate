package com.daebak.common.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch

abstract class BaseViewModel: ViewModel() {
    // base Event 고정 코드 vv
    private val _baseState = MutableSharedFlow<BaseState>()
    val baseState = _baseState.asSharedFlow()

    private fun baseEventCall(state: BaseState) {
        viewModelScope.launch {
            _baseState.emit(state)
        }
    }
    // base Event 고정 코드 ^^

    sealed class BaseState {
        data class Toast(val string: String): BaseState()
    }

    protected fun toast(message: String) {
        baseEventCall(BaseState.Toast(message))
    }
}