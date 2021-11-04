package com.example.audiospeakertest.ui

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.audiospeakertest.ui.theme.AudioSpeakerTestTheme
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.audiospeakertest.R

@Composable
fun MainScreen() {
    val model: MainViewModel = viewModel()

    val playing = model.playing.value

    Button(model::playFile, enabled = !playing) {
        Text(text = stringResource(R.string.play_file))
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AudioSpeakerTestTheme {
        MainScreen()
    }
}