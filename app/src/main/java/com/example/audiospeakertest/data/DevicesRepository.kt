package com.example.audiospeakertest.data

import com.example.audiospeakertest.data.vo.OutputDevice
import javax.inject.Inject

class DevicesRepository @Inject constructor(private val source: OutputDeviceSource){
    val outputDevices get() = source.devices

    fun setCurrentDevice(device: OutputDevice) {
        source.setCurrentDevice(device)
    }
}