package com.example.audiospeakertest.framework.player

import android.content.Context
import android.media.MediaPlayer
import com.example.audiospeakertest.R
import com.example.audiospeakertest.domain.player.Player


class FilePlayer(private val context: Context) : Player {
    override suspend fun play() {
        val mediaPlayer: MediaPlayer = MediaPlayer.create(context, R.raw.audio)
        mediaPlayer.start()
    }
}