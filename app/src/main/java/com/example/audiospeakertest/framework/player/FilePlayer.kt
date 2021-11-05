package com.example.audiospeakertest.framework.player

import android.content.Context
import android.media.AudioAttributes
import android.media.AudioFormat
import android.media.AudioTrack
import com.example.audiospeakertest.R
import com.example.audiospeakertest.data.vo.OutputDevice
import com.example.audiospeakertest.domain.player.Player
import java.io.InputStream
import kotlin.coroutines.Continuation
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine


class FilePlayer(private val context: Context) : Player {
    override suspend fun play(device: OutputDevice) {
//        val deviceInfo = (device as AndroidOutputDevice).deviceInfo
//        val audioManager = context.getSystemService(Context.AUDIO_SERVICE) as AudioManager
//        audioManager.setCommunicationDevice(deviceInfo)

        suspendCoroutine<Unit> { cont ->
            createStream(R.raw.audio).use { stream ->
                cont.playAudio(/*(device as AndroidOutputDevice).deviceInfo, */stream)
            }
        }
    }

    override fun stop() {
//        mediaPlayer.pause()
    }

    private fun Continuation<Unit>.playAudio(/*deviceInfo: AudioDeviceInfo, */stream: InputStream){
        try {
            val audioTrack = createAudioTrack()
//            audioTrack.preferredDevice = deviceInfo
            audioTrack.play()

            stream.read(512){ arr, size ->
                audioTrack.write(arr, 0, size)
            }

            resume(Unit)
        }
        catch (th: Throwable){
            resumeWithException(th)
        }
    }

    private fun createAudioTrack() = AudioTrack.Builder()
        .setAudioAttributes(
            AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_ALARM)
                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                .build()
        )
        .setAudioFormat(
            AudioFormat.Builder()
                .setEncoding(AudioFormat.ENCODING_PCM_16BIT)
                .setSampleRate(44100)
                .setChannelMask(AudioFormat.CHANNEL_OUT_STEREO)
                .build()
        )
        .setBufferSizeInBytes(1024)
        .build()

    private fun InputStream.read(bufferSize: Int, action: (ByteArray, Int) -> Unit){
        var size: Int
        val buffer = ByteArray(bufferSize)

        while (true) {
            size = read(buffer)
            if (size < 0) break
            action(buffer, size)
        }
    }

    private fun createStream(audioResId: Int) = context.resources.openRawResource(audioResId)
}