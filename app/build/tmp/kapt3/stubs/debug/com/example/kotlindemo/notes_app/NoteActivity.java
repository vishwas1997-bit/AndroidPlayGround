package com.example.kotlindemo.notes_app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/kotlindemo/notes_app/NoteActivity;", "Lcom/example/kotlindemo/notes_app/ui/base/BaseActivity;", "Lcom/example/kotlindemo/databinding/ActivityNoteBinding;", "Lcom/example/kotlindemo/notes_app/NoteViewModel;", "()V", "mActivityNoteBinding", "getBindingVariable", "", "getLayoutId", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "performDependencyInjection", "buildComponent", "Lcom/example/kotlindemo/notes_app/di/component/ActivityComponent;", "app_debug"})
public final class NoteActivity extends com.example.kotlindemo.notes_app.ui.base.BaseActivity<com.example.kotlindemo.databinding.ActivityNoteBinding, com.example.kotlindemo.notes_app.NoteViewModel> {
    private com.example.kotlindemo.databinding.ActivityNoteBinding mActivityNoteBinding;
    private java.util.HashMap _$_findViewCache;
    
    public NoteActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override()
    public int getBindingVariable() {
        return 0;
    }
    
    @java.lang.Override()
    public void performDependencyInjection(@org.jetbrains.annotations.NotNull()
    com.example.kotlindemo.notes_app.di.component.ActivityComponent buildComponent) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
}