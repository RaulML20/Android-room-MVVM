package com.example.androidroom

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "alumno")
data class AlumnoEntity(
    @PrimaryKey @ColumnInfo(name = "dniA") val dniA: String,
    @ColumnInfo(name = "edad") val edad: Int
)
