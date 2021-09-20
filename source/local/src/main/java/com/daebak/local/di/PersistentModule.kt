package com.daebak.local.di

import android.content.Context
import androidx.room.Room
import com.daebak.data.DaebakDataSource
import com.daebak.local.db.DaebakDao
import com.daebak.local.db.DaebakDatabase
import com.daebak.local.impl.LocalDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PersistentModule {

    @Provides
    @Singleton
    fun provideDataBase(@ApplicationContext context: Context): DaebakDatabase {
        return Room.databaseBuilder(
            context.applicationContext,
            DaebakDatabase::class.java,
            "daebak.db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideDaebakDao(db: DaebakDatabase): DaebakDao = db.daebakDao()

    @Provides
    @Singleton
    fun provideLocalDataSource(
        daebakDao: DaebakDao,
    ): DaebakDataSource = LocalDataSourceImpl(
        daebakDao
    )
}
