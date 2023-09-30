package ru.brazhnik.voicetext.domain.interactor;

import kotlinx.coroutines.flow.Flow;
import ru.brazhnik.voicetext.domain.model.RecordState;
import ru.brazhnik.voicetext.domain.repository.ISpeechAnalyzerRepository;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0086\u0002\u00f8\u0001\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lru/brazhnik/voicetext/domain/interactor/GetRecordStateUseCase;", "", "speechRepository", "Lru/brazhnik/voicetext/domain/repository/ISpeechAnalyzerRepository;", "(Lru/brazhnik/voicetext/domain/repository/ISpeechAnalyzerRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "Lru/brazhnik/voicetext/domain/model/RecordState;", "app_debug"})
public final class GetRecordStateUseCase {
    @org.jetbrains.annotations.NotNull()
    private final ru.brazhnik.voicetext.domain.repository.ISpeechAnalyzerRepository speechRepository = null;
    
    public GetRecordStateUseCase(@org.jetbrains.annotations.NotNull()
    ru.brazhnik.voicetext.domain.repository.ISpeechAnalyzerRepository speechRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<kotlin.Result<ru.brazhnik.voicetext.domain.model.RecordState>> invoke() {
        return null;
    }
}