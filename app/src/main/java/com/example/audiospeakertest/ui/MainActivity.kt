package com.example.audiospeakertest.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.audiospeakertest.ui.theme.AudioSpeakerTestTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AudioSpeakerTestTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colors.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}