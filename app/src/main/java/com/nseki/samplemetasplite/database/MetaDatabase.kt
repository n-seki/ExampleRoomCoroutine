package com.nseki.samplemetasplite.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.nseki.samplemetasplite.DummyEntity
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Database(entities = [DummyEntity::class], version = 1)
abstract class MetaDatabase : RoomDatabase() {
    abstract fun metaDao(): MetaDao

    companion object {

        @Volatile
        private var INSTANCE: MetaDatabase? = null

        fun getInstance(context: Context): MetaDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MetaDatabase::class.java,
                    "meta-db"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}


@Module
object DatabaseModule {

    @Provides
    @Singleton
    fun provideMetaDatabase(context: Context): MetaDatabase {
        return MetaDatabase.getInstance(context)
    }

    @Provides
    fun provideMetaDao(database: MetaDatabase): MetaDao {
        return database.metaDao()
    }
}