package ru.brazhnik.voicetext.domain.repository

import kotlinx.coroutines.flow.Flow
import ru.brazhnik.voicetext.domain.model.RecordState

interface ISpeechAnalyzerRepository {
    fun startListening()
    fun stopListening()
    fun destroy()
    fun getRecordState(): Flow<Result<RecordState>>
    fun getResultText(): Flow<Result<String>>
}