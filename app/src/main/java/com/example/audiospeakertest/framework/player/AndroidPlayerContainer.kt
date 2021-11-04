package com.example.audiospeakertest.framework.player

import android.content.Context
import com.example.audiospeakertest.domain.player.PlayerContainer
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class AndroidPlayerContainer @Inject constructor(@ApplicationContext private val context: Context): PlayerContainer {
    override fun provideFilePlayer() = FilePlayer(context)
}