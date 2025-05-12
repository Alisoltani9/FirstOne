package com.example.shoppy.app

import android.app.Application
import androidx.room.Room
import com.example.shoppy.data.local.db.AppDatabase

class MainApplication: Application() {

    companion object {
        lateinit var appDatabase: AppDatabase
    }

    override fun onCreate() {
        super.onCreate()
        appDatabase = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            AppDatabase.DATABASE_NAME
        ).build()
    }
}