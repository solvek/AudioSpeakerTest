package com.example.audiospeakertest.usecases

import com.example.audiospeakertest.data.DevicesRepository
import javax.inject.Inject

class DevicesInteractor @Inject constructor(private val devicesRepository: DevicesRepository) {
    val outputDevices get() = devicesRepository.outputDevices
}