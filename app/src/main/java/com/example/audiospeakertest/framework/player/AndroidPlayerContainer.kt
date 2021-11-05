package com.example.audiospeakertest.framework.player

import android.content.Context
import com.example.audiospeakertest.data.OutputDeviceSource
import com.example.audiospeakertest.domain.player.PlayerContainer
import com.example.audiospeakertest.framework.devices.AndroidOutputDeviceSource
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class AndroidPlayerContainer @Inject constructor(
    @ApplicationContext private val context: Context,
    outputDevicesSource: AndroidOutputDeviceSource
): PlayerContainer {

    override fun provideFilePlayer() = FilePlayer(context)
}