package com.example.audiospeakertest.ui

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.audiospeakertest.framework.bt.BluetoothInteractor
import com.example.audiospeakertest.framework.devices.vo.AndroidOutputDevice
import com.example.audiospeakertest.framework.system.AudioSystem
import com.example.audiospeakertest.framework.system.getAddress2
import com.example.audiospeakertest.usecases.DevicesInteractor
import com.example.audiospeakertest.usecases.PlayInteractor
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
        private val playInteractor: PlayInteractor,
        devicesInteractor: DevicesInteractor) : ViewModel() {

    @Inject
    lateinit var bluetoothInteractor: BluetoothInteractor

    val playing = androidx.compose.runtime.mutableStateOf(false)

    private val filePlayer by lazy {
        playInteractor.filePlayer
    }
    private val outputs by lazy {
        devicesInteractor.outputDevices/*.also {
            Timber.tag(TAG).i("Output devices (${it.size}): $it")
        }*/
    }

    @SuppressLint("MissingPermission")
    fun playFile(){
//        AudioSystem.print()

        Timber.tag(TAG).i("Button pressed")

//        bluetoothInteractor.scan()

        val device = bluetoothInteractor.getDevice("00:23:02:39:D9:09")
        val bondCreated = device.createBond()
        Timber.tag(TAG).i("Bond was created: $bondCreated")

        viewModelScope.launch {
            playing.value = true
            val index = 0
            val output = outputs[index]
//            setOutput(index)
            Timber.tag(TAG).i("Playing to output $output")

            val res1 = AudioSystem.setDeviceConnectionState(-1, false, "", "")
            Timber.tag(TAG).i("Result: $res1")
            val res2 = AudioSystem.setDeviceConnectionState(AudioSystem.DEVICE_OUT_SPEAKER, true, "", "")
            Timber.tag(TAG).i("Result: $res2")

            filePlayer.play(output)
            playing.value = false
        }
    }

    fun stopFile(){
        filePlayer.stop()
        playing.value = false
    }

    private fun setOutput(index: Int){
        outputs.forEachIndexed{ idx, output ->
            val deviceInfo = (output as AndroidOutputDevice).deviceInfo
//            val name = AudioSystem.getDeviceName(deviceInfo.type)
            val name = deviceInfo.productName.toString()
            val type = deviceInfo.type
            val connectionState = AudioSystem.getDeviceConnectionState(type, "")
            val address = deviceInfo.getAddress2()
            val res = AudioSystem.setDeviceConnectionState(deviceInfo.id, idx == index, address, name)
            Timber.tag(TAG).i("Device $name, type = $type, address = $address, connectionState = $connectionState, id=${output.id}, result = $res")
        }
    }

    companion object {
        private const val TAG = "MainViewModel"
    }
}