package com.nseki.samplemetasplite.database

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction

@Dao
interface MetaDao {

    @Query("SELECT sqlite_version();")
    suspend fun getVersion(): String

    @Transaction
    suspend fun getAllTableName(database: MetaDatabase): List<String> {
        val cursor = database.query(
            """
                SELECT name
                  FROM sqlite_master
                 WHERE type = 'table'
                 ORDER BY name
            """.trimIndent(),
            emptyArray()
        )
        val tables = mutableListOf<String>()
        cursor.use {
            while (it.moveToNext()) {
                tables += it.getString(0)
            }
        }
        return tables
    }
}