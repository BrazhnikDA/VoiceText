// Generated by Dagger (https://dagger.dev).
package ru.brazhnik.voicetext.data.repository.di;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class RepositoryModule_ProvideContextFactory implements Factory<Context> {
  private final Provider<Context> appContextProvider;

  public RepositoryModule_ProvideContextFactory(Provider<Context> appContextProvider) {
    this.appContextProvider = appContextProvider;
  }

  @Override
  public Context get() {
    return provideContext(appContextProvider.get());
  }

  public static RepositoryModule_ProvideContextFactory create(
      Provider<Context> appContextProvider) {
    return new RepositoryModule_ProvideContextFactory(appContextProvider);
  }

  public static Context provideContext(Context appContext) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideContext(appContext));
  }
}