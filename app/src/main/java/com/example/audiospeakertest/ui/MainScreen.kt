package com.example.audiospeakertest.ui

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.audiospeakertest.ui.theme.AudioSpeakerTestTheme

@Composable
fun MainScreen() {
    Text(text = "Hello you!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AudioSpeakerTestTheme {
        MainScreen()
    }
}