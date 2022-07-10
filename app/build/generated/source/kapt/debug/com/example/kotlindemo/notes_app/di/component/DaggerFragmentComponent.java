// Generated by Dagger (https://google.github.io/dagger).
package com.example.kotlindemo.notes_app.di.component;

import com.example.kotlindemo.notes_app.di.module.FragmentModule;
import com.example.kotlindemo.notes_app.di.module.FragmentModule_ProvideNoteViewModelFactory;
import com.example.kotlindemo.notes_app.ui.base.BaseFragment_MembersInjector;
import com.example.kotlindemo.notes_app.ui.fragment.NoteAddFragment;
import com.example.kotlindemo.notes_app.ui.fragment.NoteListFragment;
import com.example.kotlindemo.notes_app.ui.fragment.NoteUpdateFragment;
import dagger.internal.Preconditions;

public final class DaggerFragmentComponent implements FragmentComponent {
  private FragmentModule fragmentModule;

  private DaggerFragmentComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.fragmentModule = builder.fragmentModule;
  }

  @Override
  public void inject(NoteListFragment fragment) {
    injectNoteListFragment(fragment);
  }

  @Override
  public void inject(NoteAddFragment fragment) {
    injectNoteAddFragment(fragment);
  }

  @Override
  public void inject(NoteUpdateFragment fragment) {}

  private NoteListFragment injectNoteListFragment(NoteListFragment instance) {
    BaseFragment_MembersInjector.injectSetMViewModel(
        instance,
        FragmentModule_ProvideNoteViewModelFactory.proxyProvideNoteViewModel(fragmentModule));
    return instance;
  }

  private NoteAddFragment injectNoteAddFragment(NoteAddFragment instance) {
    BaseFragment_MembersInjector.injectSetMViewModel(
        instance,
        FragmentModule_ProvideNoteViewModelFactory.proxyProvideNoteViewModel(fragmentModule));
    return instance;
  }

  public static final class Builder {
    private FragmentModule fragmentModule;

    private AppComponent appComponent;

    private Builder() {}

    public FragmentComponent build() {
      if (fragmentModule == null) {
        throw new IllegalStateException(FragmentModule.class.getCanonicalName() + " must be set");
      }
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerFragmentComponent(this);
    }

    public Builder fragmentModule(FragmentModule fragmentModule) {
      this.fragmentModule = Preconditions.checkNotNull(fragmentModule);
      return this;
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }
  }
}
