package ru.brazhnik.voicetext.view.notepad;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.StateFlow;
import ru.brazhnik.voicetext.domain.interactor.*;
import ru.brazhnik.voicetext.domain.model.RecordState;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0017H\u0014J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0017J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\b\u0010\u001b\u001a\u00020\u0017H\u0002R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001c"}, d2 = {"Lru/brazhnik/voicetext/view/notepad/NotepadScreenViewModel;", "Landroidx/lifecycle/ViewModel;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "startListeningUseCase", "Lru/brazhnik/voicetext/domain/interactor/StartListeningUseCase;", "stopListeningUseCase", "Lru/brazhnik/voicetext/domain/interactor/StopListeningUseCase;", "getRecordStateUseCase", "Lru/brazhnik/voicetext/domain/interactor/GetRecordStateUseCase;", "getResultTextUseCase", "Lru/brazhnik/voicetext/domain/interactor/GetResultTextUseCase;", "destroyUseCase", "Lru/brazhnik/voicetext/domain/interactor/DestroyUseCase;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lru/brazhnik/voicetext/domain/interactor/StartListeningUseCase;Lru/brazhnik/voicetext/domain/interactor/StopListeningUseCase;Lru/brazhnik/voicetext/domain/interactor/GetRecordStateUseCase;Lru/brazhnik/voicetext/domain/interactor/GetResultTextUseCase;Lru/brazhnik/voicetext/domain/interactor/DestroyUseCase;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lru/brazhnik/voicetext/view/notepad/NotepadScreenUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState$app_debug", "()Lkotlinx/coroutines/flow/StateFlow;", "onCleared", "", "onStart", "onStop", "updateRecordState", "updateResultText", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class NotepadScreenViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher = null;
    @org.jetbrains.annotations.NotNull()
    private final ru.brazhnik.voicetext.domain.interactor.StartListeningUseCase startListeningUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final ru.brazhnik.voicetext.domain.interactor.StopListeningUseCase stopListeningUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final ru.brazhnik.voicetext.domain.interactor.GetRecordStateUseCase getRecordStateUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final ru.brazhnik.voicetext.domain.interactor.GetResultTextUseCase getResultTextUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final ru.brazhnik.voicetext.domain.interactor.DestroyUseCase destroyUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.MutableStateFlow<ru.brazhnik.voicetext.view.notepad.NotepadScreenUiState> _uiState;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<ru.brazhnik.voicetext.view.notepad.NotepadScreenUiState> uiState = null;
    
    @javax.inject.Inject()
    public NotepadScreenViewModel(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher dispatcher, @org.jetbrains.annotations.NotNull()
    ru.brazhnik.voicetext.domain.interactor.StartListeningUseCase startListeningUseCase, @org.jetbrains.annotations.NotNull()
    ru.brazhnik.voicetext.domain.interactor.StopListeningUseCase stopListeningUseCase, @org.jetbrains.annotations.NotNull()
    ru.brazhnik.voicetext.domain.interactor.GetRecordStateUseCase getRecordStateUseCase, @org.jetbrains.annotations.NotNull()
    ru.brazhnik.voicetext.domain.interactor.GetResultTextUseCase getResultTextUseCase, @org.jetbrains.annotations.NotNull()
    ru.brazhnik.voicetext.domain.interactor.DestroyUseCase destroyUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<ru.brazhnik.voicetext.view.notepad.NotepadScreenUiState> getUiState$app_debug() {
        return null;
    }
    
    private final void updateRecordState() {
    }
    
    private final void updateResultText() {
    }
    
    public final void onStart() {
    }
    
    public final void onStop() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}