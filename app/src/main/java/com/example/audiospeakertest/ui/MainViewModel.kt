package com.example.audiospeakertest.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.audiospeakertest.domain.player.Player
import com.example.audiospeakertest.usecases.PlayInteractor
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
        private val playInteractor: PlayInteractor) : ViewModel() {

    val playing = androidx.compose.runtime.mutableStateOf(false)

    private lateinit var filePlayer: Player

    fun playFile(){
        ensureFilePlayer()

        viewModelScope.launch {
            playing.value = true
            filePlayer.play()
            playing.value = false
        }
    }

    fun stopFile(){
        ensureFilePlayer()
        filePlayer.stop()
        playing.value = false
    }

    private fun ensureFilePlayer() {
        if (this::filePlayer.isInitialized) return
        filePlayer = playInteractor.filePlayer
    }
}