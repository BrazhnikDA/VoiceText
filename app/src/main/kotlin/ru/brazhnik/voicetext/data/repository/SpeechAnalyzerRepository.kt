package ru.brazhnik.voicetext.data.repository

import android.content.Context
import android.content.Intent
import android.speech.RecognitionListener
import android.speech.SpeechRecognizer
import android.os.Bundle
import android.speech.RecognizerIntent
import android.util.Log
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import ru.brazhnik.voicetext.domain.model.RecordState
import ru.brazhnik.voicetext.domain.repository.ISpeechAnalyzerRepository
import javax.inject.Inject

private const val LOG_NAME = "NotepadScreenViewModel"

class SpeechAnalyzerRepository @Inject constructor(
    context: Context,
    dispatcher: CoroutineDispatcher = Dispatchers.Main,
) : ISpeechAnalyzerRepository {
    private lateinit var speechRecognizer: SpeechRecognizer

    private val updateScope = CoroutineScope(SupervisorJob())

    val recordState =
        MutableStateFlow<Result<RecordState>>(Result.success(RecordState.STOP))

    val resultText = MutableStateFlow<Result<String>>(Result.success(""))

    override fun getRecordState(): Flow<Result<RecordState>> {
        Log.d(LOG_NAME, "getRecordState")
        return recordState
    }

    override fun getResultText(): Flow<Result<String>> {
        Log.d(LOG_NAME, "getResultText")
        return resultText
    }

    init {
        Log.d(LOG_NAME, "Call init")
        if (SpeechRecognizer.isRecognitionAvailable(context)) {
            speechRecognizer = SpeechRecognizer.createSpeechRecognizer(context)
            speechRecognizer.setRecognitionListener(object : RecognitionListener {
                override fun onReadyForSpeech(params: Bundle?) {
                    // вызывается, когда аудиозапись готова к распознаванию речи
                }

                override fun onBeginningOfSpeech() {
                    Log.d(LOG_NAME, "RecognitionListener onBeginningOfSpeech")
                    updateScope.launch(dispatcher) {
                        recordState.tryEmit(Result.success(RecordState.START))
                    }
                }

                override fun onRmsChanged(rmsdB: Float) {
                    // вызывается, когда уровень громкости меняется
                }

                override fun onBufferReceived(buffer: ByteArray?) {
                    // вызывается, когда получены промежуточные результаты
                }

                override fun onEndOfSpeech() {
                    Log.d(LOG_NAME, "RecognitionListener onEndOfSpeech")
                    updateScope.launch(dispatcher) {
                        recordState.tryEmit(Result.success(RecordState.STOP))
                    }
                }

                override fun onError(error: Int) {
                    Log.d(LOG_NAME, "RecognitionListener onError")
                    // вызывается, если произошла ошибка распознавания
                    updateScope.launch(dispatcher) {
                        recordState.tryEmit(Result.failure(Throwable()))
                        resultText.tryEmit(Result.failure(Throwable()))
                    }
                }

                override fun onResults(results: Bundle?) {
                    Log.d(LOG_NAME, "RecognitionListener onResults")
                    // вызывается, когда получены окончательные результаты
                    val matches = results?.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION)
                    if (!matches.isNullOrEmpty()) {
                        val recognizedText = matches[0]
                        // Далее можно использовать распознанный текст
                        Log.d(LOG_NAME, "RecognitionListener onResults=$recognizedText")
                        resultText.tryEmit(Result.success(recognizedText))
                    }
                }

                override fun onPartialResults(partialResults: Bundle?) {
                    // вызывается, когда получены промежуточные результаты
                }

                override fun onEvent(eventType: Int, params: Bundle?) {
                    // вызывается, когда получены дополнительные события
                }
            })
        } else {
            // Speech recognition not supported on this device
            // Handle accordingly
        }
    }

    override fun startListening() {
        Log.d(LOG_NAME, "startListening")
        val recognizerIntent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH).apply {
            putExtra(
                RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM
            )
            putExtra(RecognizerIntent.EXTRA_PARTIAL_RESULTS, true)
        }
        speechRecognizer.startListening(recognizerIntent)
    }

    override fun stopListening() {
        Log.d(LOG_NAME, "stopListening")
        speechRecognizer.stopListening()
    }

    override fun destroy() {
        Log.d(LOG_NAME, "destroy")
        speechRecognizer.destroy()
    }
}