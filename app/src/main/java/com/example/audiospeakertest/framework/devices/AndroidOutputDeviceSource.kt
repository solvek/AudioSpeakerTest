package com.example.audiospeakertest.framework.devices

import android.media.AudioManager
import com.example.audiospeakertest.data.OutputDeviceSource
import com.example.audiospeakertest.data.vo.OutputDevice
import com.example.audiospeakertest.framework.devices.vo.AndroidOutputDevice
import javax.inject.Inject

class AndroidOutputDeviceSource @Inject constructor(private val audioManager: AudioManager)
    : OutputDeviceSource {

    override val devices: List<OutputDevice>
        get() = audioManager
            .getDevices(AudioManager.GET_DEVICES_OUTPUTS)
            .map { AndroidOutputDevice(it) }
            .toList()
}