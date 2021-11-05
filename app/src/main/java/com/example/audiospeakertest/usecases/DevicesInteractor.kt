package com.example.audiospeakertest.usecases

import com.example.audiospeakertest.data.DevicesRepository
import com.example.audiospeakertest.data.vo.OutputDevice
import javax.inject.Inject

class DevicesInteractor @Inject constructor(private val devicesRepository: DevicesRepository) {
    val outputDevices get() = devicesRepository.outputDevices

    fun setCurrentDevice(device: OutputDevice) {
        devicesRepository.setCurrentDevice(device)
    }
}