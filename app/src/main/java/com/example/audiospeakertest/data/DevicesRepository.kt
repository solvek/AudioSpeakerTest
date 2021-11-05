package com.example.audiospeakertest.data

import javax.inject.Inject

class DevicesRepository @Inject constructor(private val source: OutputDeviceSource){
    val outputDevices get() = source.devices
}