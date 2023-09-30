package ru.brazhnik.voicetext.domain.interactor

import kotlinx.coroutines.flow.Flow
import ru.brazhnik.voicetext.domain.model.RecordState
import ru.brazhnik.voicetext.domain.repository.ISpeechAnalyzerRepository

class GetRecordStateUseCase constructor(
    private val speechRepository: ISpeechAnalyzerRepository,
) {

    operator fun invoke(): Flow<Result<RecordState>> {
        return speechRepository.getRecordState()
    }
}