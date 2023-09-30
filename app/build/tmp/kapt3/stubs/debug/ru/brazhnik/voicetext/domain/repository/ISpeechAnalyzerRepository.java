package ru.brazhnik.voicetext.domain.repository;

import kotlinx.coroutines.flow.Flow;
import ru.brazhnik.voicetext.domain.model.RecordState;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0017\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H&\u00f8\u0001\u0000J\u0017\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u0005H&\u00f8\u0001\u0000J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lru/brazhnik/voicetext/domain/repository/ISpeechAnalyzerRepository;", "", "destroy", "", "getRecordState", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "Lru/brazhnik/voicetext/domain/model/RecordState;", "getResultText", "", "startListening", "stopListening", "app_debug"})
public abstract interface ISpeechAnalyzerRepository {
    
    public abstract void startListening();
    
    public abstract void stopListening();
    
    public abstract void destroy();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<ru.brazhnik.voicetext.domain.model.RecordState>> getRecordState();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<java.lang.String>> getResultText();
}