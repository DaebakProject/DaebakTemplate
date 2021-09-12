package com.daebak.common.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch

abstract class BaseViewModel: ViewModel() {
    // base Event 고정 코드 vv
    private val _baseEvent = MutableSharedFlow<BaseEvent>()
    val baseEvent = _baseEvent.asSharedFlow()

    private fun baseEventCall(event: BaseEvent) {
        viewModelScope.launch {
            _baseEvent.emit(event)
        }
    }
    // base Event 고정 코드 ^^

    sealed class BaseEvent {
        data class Toast(val string: String): BaseEvent()
    }

    protected fun toast(message: String) {
        baseEventCall(BaseEvent.Toast(message))
    }
}