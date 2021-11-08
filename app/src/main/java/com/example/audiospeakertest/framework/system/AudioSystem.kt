package com.example.audiospeakertest.framework.system

import android.annotation.SuppressLint
import timber.log.Timber

/**
 * Uses hidden android class (https://github.com/aosp-mirror/platform_frameworks_base/blob/master/media/java/android/media/AudioSystem.java)
 * (Android 7 https://github.com/aosp-mirror/platform_frameworks_base/blob/nougat-cts-release/media/java/android/media/AudioSystem.java)
 * Usage https://stackoverflow.com/questions/29969030/android-force-audio-routing/30049718#30049718
 */
@SuppressLint("PrivateApi")
object AudioSystem {
    private const val TAG = "AudioSystem"

    private val clazz = Class.forName("android.media.AudioSystem")

    fun setDeviceConnectionState(deviceCode: Int, state: Boolean, address: String, name: String) =
        clazz
            .getMethod("setDeviceConnectionState", Int::class.java, Int::class.java, String::class.java, String::class.java)
            .invoke(clazz, deviceCode, if (state) 1 else 0, address, name)

    fun getDeviceConnectionState(deviceCode: Int, address: String) =
        clazz
            .getMethod("getDeviceConnectionState", Int::class.java, String::class.java)
            .invoke(clazz, deviceCode, address) as Int

    fun getDeviceName(deviceCode: Int) =
        clazz
            .getMethod("getDeviceName", Int::class.java)
            .invoke(clazz, deviceCode) as String

    fun print(){
//        val clazz = Class.forName("android.media.AudioManager")
        val classInfo = clazz.methods.joinToString("\r\n") { method ->
            "${method.name}(" + method.parameterTypes.joinToString(", ") { param -> param.simpleName } + ")"
        }

        Timber.tag(TAG).d("AudioSystem info $classInfo")
    }
}