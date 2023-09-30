package ru.brazhnik.voicetext.data.repository.di

import android.content.Context
import android.media.MediaRecorder
import android.os.Build
import android.os.Environment
import androidx.annotation.RequiresApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import ru.brazhnik.voicetext.data.repository.SpeechAnalyzerRepository
import ru.brazhnik.voicetext.domain.repository.ISpeechAnalyzerRepository
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object RepositoryModule {

    @Provides
    fun provideContext(
        @ApplicationContext appContext: Context,
    ): Context {
        return appContext
    }

    @RequiresApi(Build.VERSION_CODES.S)
    @Provides
    fun provideMediaRecorder(
        @ApplicationContext appContext: Context,
    ): MediaRecorder {
        return MediaRecorder(appContext).apply {
            this.setAudioSource(MediaRecorder.AudioSource.MIC)
            this.setOutputFormat(MediaRecorder.OutputFormat.MPEG_4)
            this.setOutputFile(Environment.getExternalStorageDirectory().absolutePath + "/recording.mp3")
        }
    }

    @Singleton
    @Provides
    fun provideSpeechAnalyzerRepository(
        @ApplicationContext appContext: Context,
    ): ISpeechAnalyzerRepository {
        return SpeechAnalyzerRepository(appContext)
    }
}
