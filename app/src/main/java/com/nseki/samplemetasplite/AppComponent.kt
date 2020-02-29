package com.nseki.samplemetasplite

import android.content.Context
import com.nseki.samplemetasplite.database.DatabaseModule
import com.nseki.samplemetasplite.presentation.MainActivityModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        DatabaseModule::class,
        MainActivityModule::class
    ]
)
interface AppComponent : AndroidInjector<App> {

    @Component.Factory
    interface Factory {
        fun newComponent(@BindsInstance context: Context): AppComponent
    }
}