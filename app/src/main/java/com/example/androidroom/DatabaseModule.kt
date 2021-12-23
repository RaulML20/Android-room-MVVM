package com.example.androidroom

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule {
    @Provides
    fun provideAlumno(universityDatabase: UniversityDatabase): AlumnoDAO {
        return universityDatabase.alumnoDao()
    }

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext appContext: Context): UniversityDatabase {
        return Room.databaseBuilder(
            appContext,
            UniversityDatabase::class.java,
            "RssReader"
        ).build()
    }
}