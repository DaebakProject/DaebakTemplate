package com.daebak.template

import android.app.Activity
import android.app.Application
import android.os.Bundle
import com.daebak.common.base.NonUiActivity

object LifeCycleCallback: Application.ActivityLifecycleCallbacks {
    private var running = 0
    private var uiRunning = 0

    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
        running += 1
        if (activity !is NonUiActivity) uiRunning += 1
    }

    override fun onActivityStarted(activity: Activity) {
    }

    override fun onActivityResumed(activity: Activity) {
    }

    override fun onActivityPaused(activity: Activity) {
    }

    override fun onActivityStopped(activity: Activity) {
    }

    override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {}

    override fun onActivityDestroyed(activity: Activity) {
        running -= 1
        if (activity !is NonUiActivity) uiRunning -= 1
    }

    fun isRootUiActivity() = uiRunning == 1
    fun isRootActivity() = running == 1
    fun isRootNotUiActivity() = running == 1 && uiRunning == 0
}