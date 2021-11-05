package com.example.audiospeakertest.framework.di

import android.content.Context
import android.media.AudioManager
import com.example.audiospeakertest.data.OutputDeviceSource
import com.example.audiospeakertest.framework.devices.AndroidOutputDeviceSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AudioModule {
    @Provides
    @Singleton
    fun provideAudioManager(@ApplicationContext context: Context)
        = context.getSystemService(Context.AUDIO_SERVICE) as AudioManager

    @Provides
    @Singleton
    fun provideOutputDeviceSource(source: AndroidOutputDeviceSource): OutputDeviceSource = source
}