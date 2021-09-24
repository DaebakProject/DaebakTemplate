package com.daebak.local.db

import androidx.room.Dao
import androidx.room.Query
import com.daebak.local.dto.LocalDaebakDto

@Dao
interface DaebakDao {
    @Query("SELECT * FROM daebak")
    suspend fun getAll(): List<LocalDaebakDto>
}
