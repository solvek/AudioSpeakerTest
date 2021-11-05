package com.example.audiospeakertest.domain.player

import com.example.audiospeakertest.data.vo.OutputDevice

interface Player {
    suspend fun play(device: OutputDevice)
    fun stop()
}