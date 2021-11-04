package com.example.audiospeakertest.usecases

import com.example.audiospeakertest.domain.player.PlayerContainer
import javax.inject.Inject

class PlayInteractor @Inject constructor(private val playerContainer: PlayerContainer){
    val filePlayer get() = playerContainer.provideFilePlayer()
}