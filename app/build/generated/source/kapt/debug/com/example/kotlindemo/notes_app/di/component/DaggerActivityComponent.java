// Generated by Dagger (https://dagger.dev).
package com.example.kotlindemo.notes_app.di.component;

import com.example.kotlindemo.notes_app.NoteActivity;
import com.example.kotlindemo.notes_app.di.module.ActivityModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerActivityComponent {
  private DaggerActivityComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private AppComponent appComponent;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder activityModule(ActivityModule activityModule) {
      Preconditions.checkNotNull(activityModule);
      return this;
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }

    public ActivityComponent build() {
      Preconditions.checkBuilderRequirement(appComponent, AppComponent.class);
      return new ActivityComponentImpl(appComponent);
    }
  }

  private static final class ActivityComponentImpl implements ActivityComponent {
    private final ActivityComponentImpl activityComponentImpl = this;

    private ActivityComponentImpl(AppComponent appComponentParam) {


    }

    @Override
    public void inject(NoteActivity activity) {
    }
  }
}
