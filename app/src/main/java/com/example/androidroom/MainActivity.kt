package com.example.androidroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: AlumnoViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val alumno1 = AlumnoEntity("43287654J", 20)
        viewModel.insert(alumno1)

        viewModel.allAlumnos.observe(this){
           Toast.makeText(this, alumno1.dniA, Toast.LENGTH_SHORT).show()
        }
    }
}