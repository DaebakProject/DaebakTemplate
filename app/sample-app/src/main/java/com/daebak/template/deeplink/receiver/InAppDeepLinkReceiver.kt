package com.daebak.template.deeplink.receiver

import android.content.Context
import android.content.Intent
import android.net.Uri
import com.daebak.template.deeplink.DeepLinkReceiver
import com.daebak.template.deeplink.sender.InAppDeepLinkImpl

class InAppDeepLinkReceiver(private val context: Context): DeepLinkReceiver {
    override fun onReceive(uri: Uri) {
        if (uri.path == null) {
            return
        }

        when (uri.path) {
            InAppDeepLinkImpl.PATH_START_HOME -> startHome()
        }
    }

    private fun startHome() {
        context.startActivity(Intent(/* TODO */))
    }
}