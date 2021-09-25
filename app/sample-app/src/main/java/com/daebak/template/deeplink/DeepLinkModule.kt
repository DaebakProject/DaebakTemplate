package com.daebak.template.deeplink

import android.content.Context
import com.daebak.data.InAppDeepLink
import com.daebak.template.deeplink.sender.InAppDeepLinkImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DeepLinkModule {

    @Singleton
    @Provides
    fun provideInAppDeepLink(@ApplicationContext context: Context): InAppDeepLink {
        return InAppDeepLinkImpl(context)
    }
}
