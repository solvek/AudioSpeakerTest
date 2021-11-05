package com.example.audiospeakertest.data

import com.example.audiospeakertest.data.vo.OutputDevice

interface OutputDeviceSource {
    val devices: List<OutputDevice>
}