package com.example.audiospeakertest.framework.devices.vo

import android.media.AudioDeviceInfo
import com.example.audiospeakertest.data.vo.OutputDevice

class AndroidOutputDevice(internal val deviceInfo: AudioDeviceInfo)
    : OutputDevice(deviceInfo.id, deviceInfo.productName.toString()){

    override fun toString(): String {
        with(deviceInfo) {
            return "id: $id, productName: $productName, " +
                    "channelsCount: $channelCounts, encodings: $encodings, " +
                    "type: $type"
        }
    }
}