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

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0002"}, d2 = {"LOG_NAME", "", "app_debug"})
public final class SpeechAnalyzerRepositoryKt {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String LOG_NAME = "NotepadScreenViewModel";
}