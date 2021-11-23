package com.example.audiospeakertest.framework.player

import android.content.Context
import android.media.AudioDeviceCallback
import android.media.AudioDeviceInfo
import android.media.AudioManager
import android.media.MediaPlayer
import com.example.audiospeakertest.R
import com.example.audiospeakertest.data.vo.OutputDevice
import com.example.audiospeakertest.domain.player.Player
import com.example.audiospeakertest.framework.devices.vo.AndroidOutputDevice
import timber.log.Timber
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine


class FilePlayer(private val context: Context) : Player {

    private val audioManager = context.getSystemService(Context.AUDIO_SERVICE) as AudioManager
    private var mediaPlayer: MediaPlayer? = null

    init {
        audioManager.registerAudioDeviceCallback(object : AudioDeviceCallback() {
            override fun onAudioDevicesAdded(addedDevices: Array<out AudioDeviceInfo>?) {
                super.onAudioDevicesAdded(addedDevices)
                Timber.tag(TAG).d("onAudioDevicesAdded")
                printDevices(addedDevices)
            }

            override fun onAudioDevicesRemoved(removedDevices: Array<out AudioDeviceInfo>?) {
                super.onAudioDevicesRemoved(removedDevices)
                Timber.tag(TAG).d("onAudioDevicesRemoved")
                printDevices(removedDevices)
            }
        }, null)
    }

    override suspend fun play(device: OutputDevice) {
//        audioManager.isSpeakerphoneOn = true
//        audioManager.isBluetoothScoOn = false

        mediaPlayer = MediaPlayer.create(context, R.raw.long_music)
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
        mediaPlayer?.let {
            it.pause()
        }
    }

    private fun printDevices(devices: Array<out AudioDeviceInfo>?){
        if (devices == null){
            Timber.tag(TAG).i("No devices provided")
            return
        }
        Timber.tag(TAG).i(devices.map{ AndroidOutputDevice(it) }.joinToString("\r\n"))
    }

    companion object {
        private const val TAG = "FilePlayer"
    }
}