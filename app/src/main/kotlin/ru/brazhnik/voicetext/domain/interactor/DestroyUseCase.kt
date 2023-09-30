package ru.brazhnik.voicetext.domain.interactor

import ru.brazhnik.voicetext.domain.repository.ISpeechAnalyzerRepository

class DestroyUseCase constructor(
    private val speechRepository: ISpeechAnalyzerRepository,
) {

    operator fun invoke() {
        return speechRepository.destroy()
    }
}