package com.example.audiospeakertest.framework.player

import android.content.Context
import android.media.MediaPlayer
import com.example.audiospeakertest.R
import com.example.audiospeakertest.domain.player.Player
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine


class FilePlayer(context: Context) : Player {
    private val mediaPlayer: MediaPlayer = MediaPlayer.create(context, R.raw.audio)

    override suspend fun play() {
        suspendCoroutine<Unit> { cont ->
            try {
                mediaPlayer.setOnCompletionListener {
                    cont.resume(Unit)
                }
                mediaPlayer.seekTo(0)
//                mediaPlayer.reset()
                mediaPlayer.start()
            }
            catch (th: Throwable){
                cont.resumeWithException(th)
            }
        }
    }

    override fun stop() {
        mediaPlayer.pause()
    }
}