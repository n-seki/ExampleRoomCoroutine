package com.nseki.samplemetasplite;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/nseki/samplemetasplite/AppComponent;", "Ldagger/android/AndroidInjector;", "Lcom/nseki/samplemetasplite/App;", "Factory", "app_debug"})
@dagger.Component(modules = {dagger.android.AndroidInjectionModule.class, com.nseki.samplemetasplite.database.DatabaseModule.class, com.nseki.samplemetasplite.presentation.MainActivityModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent extends dagger.android.AndroidInjector<com.nseki.samplemetasplite.App> {
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/nseki/samplemetasplite/AppComponent$Factory;", "", "newComponent", "Lcom/nseki/samplemetasplite/AppComponent;", "context", "Landroid/content/Context;", "app_debug"})
    @dagger.Component.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.nseki.samplemetasplite.AppComponent newComponent(@org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        android.content.Context context);
    }
}