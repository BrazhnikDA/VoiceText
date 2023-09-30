package ru.brazhnik.voicetext;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = VoiceTextApp.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface VoiceTextApp_GeneratedInjector {
  void injectVoiceTextApp(VoiceTextApp voiceTextApp);
}
