package com.example.audiospeakertest.framework

import android.app.Application
import com.example.audiospeakertest.hack.C0200av
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class SamplePlayerApp: Application() {
    override fun onCreate() {
        super.onCreate()

        val secretString = C0200av.m970a(-97949707490476)

        Timber.plant(Timber.DebugTree())
        Timber.tag("Test").i("App started")
    }
}