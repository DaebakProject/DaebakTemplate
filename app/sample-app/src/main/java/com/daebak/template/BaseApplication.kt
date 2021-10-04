package com.daebak.template

import android.app.Application

class BaseApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        registerActivityLifecycleCallbacks(LifeCycleCallback)
    }
}