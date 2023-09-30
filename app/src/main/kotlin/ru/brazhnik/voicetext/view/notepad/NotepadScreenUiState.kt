package ru.brazhnik.voicetext.view.notepad

import ru.brazhnik.voicetext.domain.model.RecordState


internal sealed class NotepadScreenUiState {

    object Loading : NotepadScreenUiState()

    data class Success(val value: NotepadInfo) : NotepadScreenUiState()
}

internal data class NotepadInfo(
    val title: String = "",
    val text: String = "",
    val saveState: SaveState,
    val recordState: RecordState,
)

internal enum class SaveState {
    PROGRESS,
    SAVED,
}
