// Generated by Dagger (https://dagger.dev).
package com.example.kotlindemo.notes_app.ui.base;

import androidx.databinding.ViewDataBinding;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseFragment_MembersInjector<B extends ViewDataBinding, V extends BaseViewModel<?>> implements MembersInjector<BaseFragment<B, V>> {
  private final Provider<V> p0Provider;

  public BaseFragment_MembersInjector(Provider<V> p0Provider) {
    this.p0Provider = p0Provider;
  }

  public static <B extends ViewDataBinding, V extends BaseViewModel<?>> MembersInjector<BaseFragment<B, V>> create(
      Provider<V> p0Provider) {
    return new BaseFragment_MembersInjector<B, V>(p0Provider);
  }

  @Override
  public void injectMembers(BaseFragment<B, V> instance) {
    injectSetMViewModel(instance, p0Provider.get());
  }

  public static <B extends ViewDataBinding, V extends BaseViewModel<?>> void injectSetMViewModel(
      BaseFragment<B, V> instance, V p0) {
    instance.setMViewModel(p0);
  }
}
