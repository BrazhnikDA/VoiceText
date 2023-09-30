// Generated by Dagger (https://dagger.dev).
package ru.brazhnik.voicetext.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import ru.brazhnik.voicetext.domain.interactor.GetRecordStateUseCase;
import ru.brazhnik.voicetext.domain.repository.ISpeechAnalyzerRepository;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class InteractorModule_ProvideGetRecordStateUseCaseFactory implements Factory<GetRecordStateUseCase> {
  private final Provider<ISpeechAnalyzerRepository> repositoryProvider;

  public InteractorModule_ProvideGetRecordStateUseCaseFactory(
      Provider<ISpeechAnalyzerRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetRecordStateUseCase get() {
    return provideGetRecordStateUseCase(repositoryProvider.get());
  }

  public static InteractorModule_ProvideGetRecordStateUseCaseFactory create(
      Provider<ISpeechAnalyzerRepository> repositoryProvider) {
    return new InteractorModule_ProvideGetRecordStateUseCaseFactory(repositoryProvider);
  }

  public static GetRecordStateUseCase provideGetRecordStateUseCase(
      ISpeechAnalyzerRepository repository) {
    return Preconditions.checkNotNullFromProvides(InteractorModule.INSTANCE.provideGetRecordStateUseCase(repository));
  }
}