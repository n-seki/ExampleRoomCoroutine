package com.nseki.samplemetasplite.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lcom/nseki/samplemetasplite/database/DatabaseModule;", "", "()V", "provideMetaDao", "Lcom/nseki/samplemetasplite/database/MetaDao;", "database", "Lcom/nseki/samplemetasplite/database/MetaDatabase;", "provideMetaDatabase", "context", "Landroid/content/Context;", "app_debug"})
@dagger.Module()
public final class DatabaseModule {
    public static final com.nseki.samplemetasplite.database.DatabaseModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.nseki.samplemetasplite.database.MetaDatabase provideMetaDatabase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.nseki.samplemetasplite.database.MetaDao provideMetaDao(@org.jetbrains.annotations.NotNull()
    com.nseki.samplemetasplite.database.MetaDatabase database) {
        return null;
    }
    
    private DatabaseModule() {
        super();
    }
}