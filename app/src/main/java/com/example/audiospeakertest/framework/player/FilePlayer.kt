package com.example.audiospeakertest.framework.player

import android.app.PendingIntent.getService
import android.content.Context
import android.media.MediaPlayer
import com.example.audiospeakertest.R
import com.example.audiospeakertest.data.vo.OutputDevice
import com.example.audiospeakertest.domain.player.Player
import com.example.audiospeakertest.framework.system.AudioSystem
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine


class FilePlayer(private val context: Context) : Player {

    override suspend fun play(device: OutputDevice) {
        val mediaPlayer: MediaPlayer = MediaPlayer.create(context, R.raw.audio)
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
//        mediaPlayer.pause()
    }
}