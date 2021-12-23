package com.example.androidroom

import androidx.lifecycle.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AlumnoViewModel @Inject constructor(private val repository: AlumnoRepository) : ViewModel() {

    // Using LiveData and caching what allWords returns has several benefits:
    // - We can put an observer on the data (instead of polling for changes) and only update the
    //   the UI when the data actually changes.
    // - Repository is completely separated from the UI through the ViewModel.
    val allAlumnos: LiveData<List<AlumnoEntity>> = repository.allAlumnos.asLiveData()

    /**
     * Launching a new coroutine to insert the data in a non-blocking way
     */
    fun insert(alumno: AlumnoEntity) = viewModelScope.launch {
        repository.insert(alumno)
    }
}