package com.daebak.common.base

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity() {

    abstract fun observeViewModel()
}