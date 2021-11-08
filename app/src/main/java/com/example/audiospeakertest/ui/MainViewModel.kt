package com.example.audiospeakertest.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.audiospeakertest.framework.devices.vo.AndroidOutputDevice
import com.example.audiospeakertest.framework.system.AudioSystem
import com.example.audiospeakertest.framework.system.getAddress2
import com.example.audiospeakertest.hack.C0200av
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

    val playing = androidx.compose.runtime.mutableStateOf(false)

    private val filePlayer by lazy {
        playInteractor.filePlayer
    }
    private val outputs by lazy {
        devicesInteractor.outputDevices/*.also {
            Timber.tag(TAG).i("Output devices (${it.size}): $it")
        }*/
    }

    fun playFile(){
//        AudioSystem.print()

        Timber.tag(TAG).i("Button pressed")

        viewModelScope.launch {
            playing.value = true
            val index = 0
            val output = outputs[index]
            setOutput(index)
            Timber.tag(TAG).i("Playing to output $output")
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
            val res = AudioSystem.setDeviceConnectionState(deviceInfo.type, idx == index, address, name)
            Timber.tag(TAG).i("Device $name, type = $type, address = $address, connectionState = $connectionState, id=${output.id}, result = $res")
        }
    }

    companion object {
        private const val TAG = "MainViewModel"
    }
}