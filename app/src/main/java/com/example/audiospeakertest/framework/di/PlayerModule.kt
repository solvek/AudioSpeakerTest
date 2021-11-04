package com.example.audiospeakertest.framework.di

import com.example.audiospeakertest.domain.player.PlayerContainer
import com.example.audiospeakertest.framework.player.AndroidPlayerContainer
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface PlayerModule {
    @Binds
    fun bindAndroidPlayerContainer(playerContainer: AndroidPlayerContainer): PlayerContainer
}