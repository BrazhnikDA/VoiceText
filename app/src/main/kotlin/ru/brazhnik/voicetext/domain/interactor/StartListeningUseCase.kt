package ru.brazhnik.voicetext.domain.interactor

import ru.brazhnik.voicetext.domain.repository.ISpeechAnalyzerRepository

class StartListeningUseCase constructor(
    private val speechRepository: ISpeechAnalyzerRepository,
) {

    operator fun invoke() {
        return speechRepository.startListening()
    }
}