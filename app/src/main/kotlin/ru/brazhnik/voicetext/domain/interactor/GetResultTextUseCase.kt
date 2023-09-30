package ru.brazhnik.voicetext.domain.interactor

import kotlinx.coroutines.flow.Flow
import ru.brazhnik.voicetext.domain.repository.ISpeechAnalyzerRepository

class GetResultTextUseCase constructor(
    private val speechRepository: ISpeechAnalyzerRepository,
) {

    operator fun invoke(): Flow<Result<String>> {
        return speechRepository.getResultText()
    }
}