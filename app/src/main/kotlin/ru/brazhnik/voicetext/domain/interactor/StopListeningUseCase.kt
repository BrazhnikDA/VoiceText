package ru.brazhnik.voicetext.domain.interactor

import ru.brazhnik.voicetext.domain.repository.ISpeechAnalyzerRepository

class StopListeningUseCase constructor(
    private val speechRepository: ISpeechAnalyzerRepository,
) {

    operator fun invoke() {
        return speechRepository.stopListening()
    }
}