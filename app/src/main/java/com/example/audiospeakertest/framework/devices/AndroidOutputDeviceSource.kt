package com.example.audiospeakertest.framework.devices

import android.media.AudioDeviceInfo
import android.media.AudioManager
import android.os.Build
import androidx.annotation.RequiresApi
import com.example.audiospeakertest.data.OutputDeviceSource
import com.example.audiospeakertest.data.vo.OutputDevice
import com.example.audiospeakertest.framework.devices.vo.AndroidOutputDevice
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AndroidOutputDeviceSource @Inject constructor(private val audioManager: AudioManager)
    : OutputDeviceSource {

    @RequiresApi(Build.VERSION_CODES.S)
    internal var currentDevice: AudioDeviceInfo? =  null// audioManager.communicationDevice

    override val devices: List<OutputDevice>
        get() = audioManager
            .getDevices(AudioManager.GET_DEVICES_OUTPUTS)
            .map { AndroidOutputDevice(it) }
            .toList()

    override fun setCurrentDevice(device: OutputDevice) {
        currentDevice = (device as AndroidOutputDevice).deviceInfo
    }
}