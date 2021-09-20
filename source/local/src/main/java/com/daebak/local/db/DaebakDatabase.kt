package com.daebak.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.daebak.local.dto.LocalDaebakDto

@Database(entities = [LocalDaebakDto::class], version = 1, exportSchema = false)
abstract class DaebakDatabase: RoomDatabase() {
    abstract fun daebakDao(): DaebakDao
}
