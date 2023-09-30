package ru.brazhnik.voicetext.view.notepad

import android.support.v4.os.IResultReceiver2.Default
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import ru.brazhnik.voicetext.R
import ru.brazhnik.voicetext.domain.model.RecordState

@Composable
fun NotepadScreen() {
    val viewModel: NotepadScreenViewModel = hiltViewModel()

    when (val uiState = viewModel.uiState.collectAsState().value) {
        NotepadScreenUiState.Loading -> {
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween,
            ) {
                CircularProgressIndicator()
            }
        }
        is NotepadScreenUiState.Success -> {
            NotepadScreenContent(
                value = uiState.value,
                viewModel = viewModel,
            )
        }
    }
}

@Composable
private fun NotepadScreenContent(value: NotepadInfo, viewModel: NotepadScreenViewModel) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        TopBar(value.title, value.saveState)
        VoiceTextInput(text = value.text)
        VoiceButton(
            onStartRecord = viewModel::onStart,
            onStopRecord = viewModel::onStop,
            recordState = value.recordState
        )
    }
}

@Composable
private fun VoiceTextInput(text: String) {
    Text(text = text)
}

@Composable
private fun VoiceButton(
    onStartRecord: () -> Unit,
    onStopRecord: () -> Unit,
    recordState: RecordState
) {
    val stateRecord = remember {
        mutableStateOf(recordState)
    }
    when (stateRecord.value) {
        RecordState.STOP -> {
            Button(modifier = Modifier.size(150.dp), onClick = {
                onStartRecord()
                stateRecord.value = RecordState.START
            }) {
                Icon(
                    modifier = Modifier.size(150.dp),
                    painter = painterResource(id = R.drawable.ic_micro_off_),
                    contentDescription = "micro_off"
                )
            }
        }
        RecordState.START -> {
            Button(modifier = Modifier.size(150.dp), onClick = {
                onStopRecord()
                stateRecord.value = RecordState.STOP
            }) {
                Icon(
                    modifier = Modifier.size(150.dp),
                    painter = painterResource(id = R.drawable.ic_micro_on),
                    contentDescription = "micro_on"
                )
            }
        }
    }
}

@Composable
private fun TopBar(
    title: String,
    state: SaveState,
) {
    Row(
        modifier = Modifier
            .height(120.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Box {}
        Text(modifier = Modifier.height(120.dp), text = title, fontSize = 64.sp, maxLines = 1)
        StateFileIcon(state = state)
    }
}

@Composable
private fun StateFileIcon(state: SaveState) {
    when (state) {
        SaveState.PROGRESS -> {
            CircularProgressIndicator()
        }
        SaveState.SAVED -> {
            Icon(painter = painterResource(id = R.drawable.ic_saved), contentDescription = "Saved")
        }
    }
}