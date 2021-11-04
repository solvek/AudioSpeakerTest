package com.example.audiospeakertest.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.audiospeakertest.usecases.PlayInteractor
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
        private val playInteractor: PlayInteractor) : ViewModel() {

    val playing = androidx.compose.runtime.mutableStateOf(false)

    fun playFile(){
        viewModelScope.launch {
            playing.value = true
            playInteractor.playFile()
            playing.value = false
        }
    }
}