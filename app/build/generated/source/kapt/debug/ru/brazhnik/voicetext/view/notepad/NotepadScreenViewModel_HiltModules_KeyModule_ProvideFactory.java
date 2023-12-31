// Generated by Dagger (https://dagger.dev).
package ru.brazhnik.voicetext.view.notepad;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class NotepadScreenViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static NotepadScreenViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(NotepadScreenViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final NotepadScreenViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new NotepadScreenViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
