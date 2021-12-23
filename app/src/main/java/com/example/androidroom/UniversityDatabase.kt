package com.example.androidroom

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [AlumnoEntity::class], version = 1, exportSchema = false)
abstract class UniversityDatabase : RoomDatabase() {
    abstract fun alumnoDao(): AlumnoDAO
}