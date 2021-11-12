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

    const val DEVICE_NONE = 0x0

    // reserved bits
    const val DEVICE_BIT_IN = -0x80000000
    const val DEVICE_BIT_DEFAULT = 0x40000000

    // output devices, be sure to update AudioManager.java also
    const val DEVICE_OUT_EARPIECE = 0x1
    const val DEVICE_OUT_SPEAKER = 0x2
    const val DEVICE_OUT_WIRED_HEADSET = 0x4
    const val DEVICE_OUT_WIRED_HEADPHONE = 0x8
    const val DEVICE_OUT_BLUETOOTH_SCO = 0x10
    const val DEVICE_OUT_BLUETOOTH_SCO_HEADSET = 0x20
    const val DEVICE_OUT_BLUETOOTH_SCO_CARKIT = 0x40
    const val DEVICE_OUT_BLUETOOTH_A2DP = 0x80
    const val DEVICE_OUT_BLUETOOTH_A2DP_HEADPHONES = 0x100
    const val DEVICE_OUT_BLUETOOTH_A2DP_SPEAKER = 0x200
    const val DEVICE_OUT_AUX_DIGITAL = 0x400
    const val DEVICE_OUT_HDMI = DEVICE_OUT_AUX_DIGITAL
    const val DEVICE_OUT_ANLG_DOCK_HEADSET = 0x800
    const val DEVICE_OUT_DGTL_DOCK_HEADSET = 0x1000
    const val DEVICE_OUT_USB_ACCESSORY = 0x2000
    const val DEVICE_OUT_USB_DEVICE = 0x4000
    const val DEVICE_OUT_REMOTE_SUBMIX = 0x8000
    const val DEVICE_OUT_TELEPHONY_TX = 0x10000
    const val DEVICE_OUT_LINE = 0x20000
    const val DEVICE_OUT_HDMI_ARC = 0x40000
    const val DEVICE_OUT_SPDIF = 0x80000
    const val DEVICE_OUT_FM = 0x100000
    const val DEVICE_OUT_AUX_LINE = 0x200000
    const val DEVICE_OUT_SPEAKER_SAFE = 0x400000
    const val DEVICE_OUT_IP = 0x800000
    const val DEVICE_OUT_BUS = 0x1000000
}