package com.daebak.common.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        observeBaseViewModel()
        observeViewModel()
    }

    abstract fun registerViewModels() : List<BaseViewModel>

    private fun observeBaseViewModel() {
        registerViewModels().forEach {
            // it.baseState.collect {} 베이스 관련 state 처리
        }
    }

    abstract fun observeViewModel()
}