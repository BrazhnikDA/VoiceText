package ru.brazhnik.voicetext.view.notepad

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import ru.brazhnik.voicetext.domain.interactor.*
import ru.brazhnik.voicetext.domain.model.RecordState
import javax.inject.Inject

private const val LOG_NAME = "NotepadScreenViewModel"

@HiltViewModel
class NotepadScreenViewModel @Inject constructor(
    //private val context: Context,
    private val dispatcher: CoroutineDispatcher,
    private val startListeningUseCase: StartListeningUseCase,
    private val stopListeningUseCase: StopListeningUseCase,
    private val getRecordStateUseCase: GetRecordStateUseCase,
    private val getResultTextUseCase: GetResultTextUseCase,
    private val destroyUseCase: DestroyUseCase,
) : ViewModel() {
    private var _uiState: MutableStateFlow<NotepadScreenUiState> =
        MutableStateFlow(NotepadScreenUiState.Loading)

    internal val uiState: StateFlow<NotepadScreenUiState> = _uiState

    init {
        Log.d(LOG_NAME, "Call init")
        _uiState.value = NotepadScreenUiState.Success(
            NotepadInfo(
                title = "No name",
                text = "",
                saveState = SaveState.SAVED,
                recordState = RecordState.STOP
            )
        )
        updateRecordState()
        updateResultText()
    }

    private fun updateRecordState() {
        viewModelScope.launch(dispatcher) {
            getRecordStateUseCase().collect { result ->
                result.onSuccess { recordState ->
                    Log.d(LOG_NAME, "onSuccess updateRecordState recordState=$recordState")
                    _uiState.value = NotepadScreenUiState.Success(
                        (_uiState.value as NotepadScreenUiState.Success)
                            .value
                            .copy(recordState = recordState)
                    )
                }

                result.onFailure {
                    Log.d(LOG_NAME, "onFailure updateRecordState")
                    _uiState.value = NotepadScreenUiState.Success(
                        (_uiState.value as NotepadScreenUiState.Success)
                            .value
                            .copy(recordState = RecordState.STOP)
                    )
                }
            }
        }
    }

    private fun updateResultText() {
        viewModelScope.launch(dispatcher) {
            getResultTextUseCase().collect { result ->
                result.onSuccess { text ->
                    Log.d(LOG_NAME, "onSuccess updateResultText text=$text")
                    _uiState.value = NotepadScreenUiState.Success(
                        (_uiState.value as NotepadScreenUiState.Success)
                            .value
                            .copy(text = text)
                    )
                }

                result.onFailure {
                    Log.d(LOG_NAME, "onFailure updateResultText")
                }
            }
        }
    }

    fun onStart() {
        Log.d(LOG_NAME, "onStart")
        viewModelScope.launch(dispatcher) {
            startListeningUseCase()
        }
    }

    fun onStop() {
        Log.d(LOG_NAME, "onStop")
        viewModelScope.launch(dispatcher) {
            stopListeningUseCase()
        }
    }

    override fun onCleared() {
        Log.d(LOG_NAME, "onCleared")
        super.onCleared()
        destroyUseCase()
    }
}