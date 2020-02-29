package com.nseki.samplemetasplite.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lcom/nseki/samplemetasplite/presentation/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "database", "Lcom/nseki/samplemetasplite/database/MetaDatabase;", "dao", "Lcom/nseki/samplemetasplite/database/MetaDao;", "(Lcom/nseki/samplemetasplite/database/MetaDatabase;Lcom/nseki/samplemetasplite/database/MetaDao;)V", "allTableName", "Landroidx/lifecycle/LiveData;", "", "", "getAllTableName", "()Landroidx/lifecycle/LiveData;", "dbVersion", "getDbVersion", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> dbVersion = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<java.lang.String>> allTableName = null;
    private final com.nseki.samplemetasplite.database.MetaDatabase database = null;
    private final com.nseki.samplemetasplite.database.MetaDao dao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getDbVersion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<java.lang.String>> getAllTableName() {
        return null;
    }
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.nseki.samplemetasplite.database.MetaDatabase database, @org.jetbrains.annotations.NotNull()
    com.nseki.samplemetasplite.database.MetaDao dao) {
        super();
    }
}