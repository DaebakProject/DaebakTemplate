package com.daebak.common.base

import androidx.fragment.app.Fragment

abstract class BaseFragment: Fragment() {

    abstract fun observeViewModel()
}