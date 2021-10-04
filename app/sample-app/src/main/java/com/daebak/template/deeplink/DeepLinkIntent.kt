package com.daebak.template.deeplink

import android.content.Context
import android.content.Intent
import android.net.Uri

class DeepLinkIntent private constructor(private val context: Context): Intent() {
    class Builder(private val context: Context,
                  private val schemeName: String,
                  private val hostName: String,
                  private val pathName: String) {

        private var queryString = ""

        fun addQuery(key: String, value: String): Builder {
            queryString += if (queryString.isEmpty()) {
                "?"
            } else {
                "&"
            }

            queryString += "$key=$value"

            return this
        }

        fun build(): DeepLinkIntent {
            return DeepLinkIntent(context).apply {
                action = ACTION_VIEW
                data = Uri.parse("$schemeName://$hostName$pathName$queryString")
                flags = FLAG_ACTIVITY_NEW_TASK
                setPackage(context.packageName)
            }
        }
    }

    fun call() {
        context.startActivity(this)
    }
}