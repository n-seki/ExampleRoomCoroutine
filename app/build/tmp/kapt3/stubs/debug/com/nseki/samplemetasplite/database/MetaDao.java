package com.nseki.samplemetasplite.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0011\u0010\b\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/nseki/samplemetasplite/database/MetaDao;", "", "getAllTableName", "", "", "database", "Lcom/nseki/samplemetasplite/database/MetaDatabase;", "(Lcom/nseki/samplemetasplite/database/MetaDatabase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface MetaDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT sqlite_version();")
    public abstract java.lang.Object getVersion(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Transaction()
    public abstract java.lang.Object getAllTableName(@org.jetbrains.annotations.NotNull()
    com.nseki.samplemetasplite.database.MetaDatabase database, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> p1);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.Nullable()
        @androidx.room.Transaction()
        public static java.lang.Object getAllTableName(com.nseki.samplemetasplite.database.MetaDao $this, @org.jetbrains.annotations.NotNull()
        com.nseki.samplemetasplite.database.MetaDatabase database, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> p2) {
            return null;
        }
    }
}