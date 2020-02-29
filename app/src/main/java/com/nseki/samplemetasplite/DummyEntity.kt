package com.nseki.samplemetasplite

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "dummy_table")
data class DummyEntity(
    @PrimaryKey val value: String
)