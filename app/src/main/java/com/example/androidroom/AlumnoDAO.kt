package com.example.androidroom

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface AlumnoDAO {

    @Query("SELECT * FROM alumno ORDER BY dniA ASC")
    fun getAlumnos(): Flow<List<AlumnoEntity>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(alumno : AlumnoEntity)

    @Query("DELETE FROM alumno")
    suspend fun deleteAll()
}