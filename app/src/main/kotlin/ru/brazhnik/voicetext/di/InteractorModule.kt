/**
 * @description
 * Describe intercator instance for DI
 *
 * @author
 * Brazhnik Dmitry
 *
 */

package ru.brazhnik.voicetext.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.brazhnik.voicetext.domain.interactor.*
import ru.brazhnik.voicetext.domain.repository.ISpeechAnalyzerRepository
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object InteractorModule {

    @Singleton
    @Provides
    fun provideStartListeningUseCase(repository: ISpeechAnalyzerRepository): StartListeningUseCase {
        return StartListeningUseCase(
            speechRepository = repository,
        )
    }

    @Singleton
    @Provides
    fun provideStopListeningUseCase(repository: ISpeechAnalyzerRepository): StopListeningUseCase {
        return StopListeningUseCase(
            speechRepository = repository,
        )
    }

    @Singleton
    @Provides
    fun provideGetRecordStateUseCase(repository: ISpeechAnalyzerRepository): GetRecordStateUseCase {
        return GetRecordStateUseCase(
            speechRepository = repository,
        )
    }

    @Singleton
    @Provides
    fun provideGetResultTextUseCase(repository: ISpeechAnalyzerRepository): GetResultTextUseCase {
        return GetResultTextUseCase(
            speechRepository = repository,
        )
    }

    @Singleton
    @Provides
    fun provideDestroyUseCase(repository: ISpeechAnalyzerRepository): DestroyUseCase {
        return DestroyUseCase(
            speechRepository = repository,
        )
    }
}
