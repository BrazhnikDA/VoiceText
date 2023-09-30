package ru.brazhnik.voicetext.di;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import ru.brazhnik.voicetext.domain.interactor.*;
import ru.brazhnik.voicetext.domain.repository.ISpeechAnalyzerRepository;
import javax.inject.Singleton;

@dagger.Module()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u000f"}, d2 = {"Lru/brazhnik/voicetext/di/InteractorModule;", "", "()V", "provideDestroyUseCase", "Lru/brazhnik/voicetext/domain/interactor/DestroyUseCase;", "repository", "Lru/brazhnik/voicetext/domain/repository/ISpeechAnalyzerRepository;", "provideGetRecordStateUseCase", "Lru/brazhnik/voicetext/domain/interactor/GetRecordStateUseCase;", "provideGetResultTextUseCase", "Lru/brazhnik/voicetext/domain/interactor/GetResultTextUseCase;", "provideStartListeningUseCase", "Lru/brazhnik/voicetext/domain/interactor/StartListeningUseCase;", "provideStopListeningUseCase", "Lru/brazhnik/voicetext/domain/interactor/StopListeningUseCase;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class InteractorModule {
    @org.jetbrains.annotations.NotNull()
    public static final ru.brazhnik.voicetext.di.InteractorModule INSTANCE = null;
    
    private InteractorModule() {
        super();
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final ru.brazhnik.voicetext.domain.interactor.StartListeningUseCase provideStartListeningUseCase(@org.jetbrains.annotations.NotNull()
    ru.brazhnik.voicetext.domain.repository.ISpeechAnalyzerRepository repository) {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final ru.brazhnik.voicetext.domain.interactor.StopListeningUseCase provideStopListeningUseCase(@org.jetbrains.annotations.NotNull()
    ru.brazhnik.voicetext.domain.repository.ISpeechAnalyzerRepository repository) {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final ru.brazhnik.voicetext.domain.interactor.GetRecordStateUseCase provideGetRecordStateUseCase(@org.jetbrains.annotations.NotNull()
    ru.brazhnik.voicetext.domain.repository.ISpeechAnalyzerRepository repository) {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final ru.brazhnik.voicetext.domain.interactor.GetResultTextUseCase provideGetResultTextUseCase(@org.jetbrains.annotations.NotNull()
    ru.brazhnik.voicetext.domain.repository.ISpeechAnalyzerRepository repository) {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final ru.brazhnik.voicetext.domain.interactor.DestroyUseCase provideDestroyUseCase(@org.jetbrains.annotations.NotNull()
    ru.brazhnik.voicetext.domain.repository.ISpeechAnalyzerRepository repository) {
        return null;
    }
}