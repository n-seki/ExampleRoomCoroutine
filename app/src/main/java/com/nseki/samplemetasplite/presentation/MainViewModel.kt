package com.nseki.samplemetasplite.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.distinctUntilChanged
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import com.nseki.samplemetasplite.database.MetaDao
import com.nseki.samplemetasplite.database.MetaDatabase
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val database: MetaDatabase,
    private val dao: MetaDao
) : ViewModel() {

    val dbVersion = liveData(viewModelScope.coroutineContext + Dispatchers.IO) {
        val version = dao.getVersion()
        emit(version)
    }.distinctUntilChanged()

    val allTableName = liveData(viewModelScope.coroutineContext + Dispatchers.IO) {
        val tables = dao.getAllTableName(database)
        emit(tables)
    }.distinctUntilChanged()
}