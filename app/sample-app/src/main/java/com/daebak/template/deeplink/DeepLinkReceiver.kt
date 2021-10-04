package com.daebak.template.deeplink

import android.net.Uri

interface DeepLinkReceiver {
    fun onReceive(uri: Uri)
}