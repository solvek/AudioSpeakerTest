package com.example.audiospeakertest.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.audiospeakertest.domain.player.Player
import com.example.audiospeakertest.usecases.DevicesInteractor
import com.example.audiospeakertest.usecases.PlayInteractor
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
        private val playInteractor: PlayInteractor,
        devicesInteractor: DevicesInteractor) : ViewModel() {

    val playing = androidx.compose.runtime.mutableStateOf(false)

    private lateinit var filePlayer: Player

    init {
        val outputs = devicesInteractor.outputDevices
        Timber.tag(TAG).i("Output devices: $outputs")
    }

    fun playFile(){
        Timber.tag(TAG).i("Button pressed")

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

    companion object {
        private const val TAG = "MainViewModel"
    }
}