// Generated by Dagger (https://google.github.io/dagger).
package com.example.kotlindemo.di.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class NotesModule_ProvideContextFactory implements Factory<Context> {
  private final NotesModule module;

  public NotesModule_ProvideContextFactory(NotesModule module) {
    this.module = module;
  }

  @Override
  public Context get() {
    return provideInstance(module);
  }

  public static Context provideInstance(NotesModule module) {
    return proxyProvideContext(module);
  }

  public static NotesModule_ProvideContextFactory create(NotesModule module) {
    return new NotesModule_ProvideContextFactory(module);
  }

  public static Context proxyProvideContext(NotesModule instance) {
    return Preconditions.checkNotNull(
        instance.provideContext(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
