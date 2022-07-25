// Generated by Dagger (https://dagger.dev).
package com.example.kotlindemo.notes_app.di.module;

import com.example.kotlindemo.notes_app.data.db.AppDbHelper;
import com.example.kotlindemo.notes_app.data.db.DbHelper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideDbHelperFactory implements Factory<DbHelper> {
  private final AppModule module;

  private final Provider<AppDbHelper> appDbHelperProvider;

  public AppModule_ProvideDbHelperFactory(AppModule module,
      Provider<AppDbHelper> appDbHelperProvider) {
    this.module = module;
    this.appDbHelperProvider = appDbHelperProvider;
  }

  @Override
  public DbHelper get() {
    return provideDbHelper(module, appDbHelperProvider.get());
  }

  public static AppModule_ProvideDbHelperFactory create(AppModule module,
      Provider<AppDbHelper> appDbHelperProvider) {
    return new AppModule_ProvideDbHelperFactory(module, appDbHelperProvider);
  }

  public static DbHelper provideDbHelper(AppModule instance, AppDbHelper appDbHelper) {
    return Preconditions.checkNotNullFromProvides(instance.provideDbHelper(appDbHelper));
  }
}