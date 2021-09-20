package com.daebak.local.impl

import com.daebak.data.entity.DaebakEntity
import com.daebak.data.DaebakDataSource
import com.daebak.local.db.DaebakDao
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LocalDataSourceImpl @Inject constructor(
    private val daebakDao: DaebakDao
): DaebakDataSource {
    override fun getAll(): Flow<List<DaebakEntity>> {
        TODO("Not yet implemented")
    }
}
