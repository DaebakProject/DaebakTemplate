package com.daebak.template.deeplink.sender

import android.content.Context
import com.daebak.data.InAppDeepLink
import com.daebak.template.R
import com.daebak.template.deeplink.DeepLinkIntent

/**
 * DeepLink 를 보내는 부분 */
class InAppDeepLinkImpl(private val context: Context): InAppDeepLink {
    companion object {
        const val HOSTNAME = "in-app"

        /** path 는 '/' 부터 시작하므로 꼭 앞에 붙일것 */
        const val PATH_START_HOME = "/start-home"
    }

    override fun startHome() {
        DeepLinkIntent.Builder(
            context = context,
            schemeName = context.getString(R.string.app_scheme),
            hostName = HOSTNAME,
            pathName = PATH_START_HOME
        )
            .build()
            .call()
    }
}