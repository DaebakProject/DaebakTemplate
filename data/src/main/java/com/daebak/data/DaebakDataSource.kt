package com.daebak.data

import com.daebak.data.entity.DaebakEntity
import kotlinx.coroutines.flow.Flow

interface DaebakDataSource {
    fun getAll(): Flow<List<DaebakEntity>>
}
