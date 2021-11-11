package com.example.audiospeakertest.framework.bt

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import dagger.hilt.android.qualifiers.ApplicationContext
import timber.log.Timber
import javax.inject.Inject

@SuppressLint("MissingPermission")
class BluetoothScanner @Inject constructor(@ApplicationContext private val context: Context){
    private val receiver = object: BroadcastReceiver() {
        override fun onReceive(ctx: Context?, intent: Intent?) {
            val action = intent?.action
            if (BluetoothDevice.ACTION_FOUND == action) {
                // A Bluetooth device was found
                // Getting device information from the intent
                val device: BluetoothDevice =
                    intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE) ?: return

                val name = device.name
                Timber.tag(TAG).i("Device found: ${device.name} ; MAC ${device.address}")
            }
        }
    }
    private val manager = context.getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager
    private val adapter = manager.adapter

    fun scan(){
        val filter = IntentFilter(BluetoothDevice.ACTION_FOUND)
        context.registerReceiver(receiver, filter)
        if (adapter.isDiscovering) {
            // Bluetooth is already in modo discovery mode, we cancel to restart it again
            adapter.cancelDiscovery()
        }
        adapter.startDiscovery()
    }

    companion object {
        private const val TAG = "BluetoothScanner"
    }
}