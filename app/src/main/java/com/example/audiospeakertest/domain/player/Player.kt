package com.example.audiospeakertest.domain.player

interface Player {
    suspend fun play()
    fun stop()
}