package ru.brazhnik.voicetext.data.repository;

import android.content.Context;
import android.content.Intent;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.util.Log;
import kotlinx.coroutines.*;
import kotlinx.coroutines.flow.Flow;
import ru.brazhnik.voicetext.domain.model.RecordState;
import ru.brazhnik.voicetext.domain.repository.ISpeechAnalyzerRepository;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0017\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0016H\u0016\u00f8\u0001\u0000J\u0017\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\u0016H\u0016\u00f8\u0001\u0000J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016R \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00f8\u0001\u0000\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\b\u00f8\u0001\u0000\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lru/brazhnik/voicetext/data/repository/SpeechAnalyzerRepository;", "Lru/brazhnik/voicetext/domain/repository/ISpeechAnalyzerRepository;", "context", "Landroid/content/Context;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineDispatcher;)V", "recordState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlin/Result;", "Lru/brazhnik/voicetext/domain/model/RecordState;", "getRecordState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "resultText", "", "getResultText", "speechRecognizer", "Landroid/speech/SpeechRecognizer;", "updateScope", "Lkotlinx/coroutines/CoroutineScope;", "destroy", "", "Lkotlinx/coroutines/flow/Flow;", "startListening", "stopListening", "app_debug"})
public final class SpeechAnalyzerRepository implements ru.brazhnik.voicetext.domain.repository.ISpeechAnalyzerRepository {
    private android.speech.SpeechRecognizer speechRecognizer;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope updateScope = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<kotlin.Result<ru.brazhnik.voicetext.domain.model.RecordState>> recordState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<kotlin.Result<java.lang.String>> resultText = null;
    
    @javax.inject.Inject()
    public SpeechAnalyzerRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<kotlin.Result<ru.brazhnik.voicetext.domain.model.RecordState>> getRecordState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<kotlin.Result<java.lang.String>> getResultText() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<kotlin.Result<ru.brazhnik.voicetext.domain.model.RecordState>> getRecordState() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<kotlin.Result<java.lang.String>> getResultText() {
        return null;
    }
    
    @java.lang.Override()
    public void startListening() {
    }
    
    @java.lang.Override()
    public void stopListening() {
    }
    
    @java.lang.Override()
    public void destroy() {
    }
}