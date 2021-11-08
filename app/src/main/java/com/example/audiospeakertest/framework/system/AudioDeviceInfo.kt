package com.example.audiospeakertest.framework.system

import android.media.AudioDeviceInfo

fun AudioDeviceInfo.getAddress2() : String {
    val cl = AudioDeviceInfo::class.java
    return cl.getDeclaredMethod("getAddress").invoke(this) as String
}