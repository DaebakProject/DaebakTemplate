package com.daebak.template.deeplink

import android.content.Intent
import android.os.Bundle
import com.daebak.common.base.BaseActivity
import com.daebak.common.base.BaseViewModel
import com.daebak.common.base.NonUiActivity
import com.daebak.template.R
import com.daebak.template.deeplink.receiver.InAppDeepLinkReceiver
import com.daebak.template.deeplink.sender.InAppDeepLinkImpl

class DeepLinkActivity: BaseActivity(), NonUiActivity {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        parseUri(intent)
        finish()
    }

    override fun registerViewModels(): List<BaseViewModel> = emptyList()

    override fun observeViewModel() { /** do nothing */ }

    private fun parseUri(intent: Intent) {
        val uri = intent.data

        if (uri == null || uri.scheme != getString(R.string.app_scheme)) {
            return
        }

        when (uri.host) {
            InAppDeepLinkImpl.HOSTNAME -> InAppDeepLinkReceiver(this)
            else -> null
        }?.onReceive(uri)
    }
}