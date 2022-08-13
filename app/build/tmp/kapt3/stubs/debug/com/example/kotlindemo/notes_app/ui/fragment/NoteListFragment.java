package com.example.kotlindemo.notes_app.ui.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001,B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010#\u001a\u00020\u001dH\u0016J\b\u0010$\u001a\u00020\u001dH\u0016J\u0010\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\'H\u0016J\b\u0010(\u001a\u00020\u001dH\u0002J\u0018\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u0017H\u0016R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b@GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000R4\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f@GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/example/kotlindemo/notes_app/ui/fragment/NoteListFragment;", "Lcom/example/kotlindemo/notes_app/ui/base/BaseFragment;", "Lcom/example/kotlindemo/databinding/FragmentNoteListBinding;", "Lcom/example/kotlindemo/notes_app/NoteViewModel;", "Lcom/example/kotlindemo/notes_app/ui/NoteNavigator;", "Lcom/example/kotlindemo/notes_app/NoteListAdapter$NoteListListener;", "()V", "<set-?>", "Lcom/example/kotlindemo/notes_app/NoteListAdapter;", "mAdapter", "getMAdapter", "()Lcom/example/kotlindemo/notes_app/NoteListAdapter;", "setMAdapter", "(Lcom/example/kotlindemo/notes_app/NoteListAdapter;)V", "mFragmentNoteListBinding", "Ljavax/inject/Provider;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "mLayoutManager", "getMLayoutManager", "()Ljavax/inject/Provider;", "setMLayoutManager", "(Ljavax/inject/Provider;)V", "param1", "", "param2", "getBindingVariable", "", "getLayoutId", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "openAddNoteFragment", "openUpdateNoteFragment", "performDependencyInjection", "buildComponent", "Lcom/example/kotlindemo/notes_app/di/component/FragmentComponent;", "setUp", "updateNote", "title", "desc", "Companion", "app_debug"})
public final class NoteListFragment extends com.example.kotlindemo.notes_app.ui.base.BaseFragment<com.example.kotlindemo.databinding.FragmentNoteListBinding, com.example.kotlindemo.notes_app.NoteViewModel> implements com.example.kotlindemo.notes_app.ui.NoteNavigator, com.example.kotlindemo.notes_app.NoteListAdapter.NoteListListener {
    private com.example.kotlindemo.databinding.FragmentNoteListBinding mFragmentNoteListBinding;
    private java.lang.String param1;
    private java.lang.String param2;
    @org.jetbrains.annotations.Nullable()
    private javax.inject.Provider<androidx.recyclerview.widget.LinearLayoutManager> mLayoutManager;
    @org.jetbrains.annotations.Nullable()
    private com.example.kotlindemo.notes_app.NoteListAdapter mAdapter;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.kotlindemo.notes_app.ui.fragment.NoteListFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public NoteListFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final javax.inject.Provider<androidx.recyclerview.widget.LinearLayoutManager> getMLayoutManager() {
        return null;
    }
    
    @javax.inject.Inject()
    public final void setMLayoutManager(@org.jetbrains.annotations.Nullable()
    javax.inject.Provider<androidx.recyclerview.widget.LinearLayoutManager> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.kotlindemo.notes_app.NoteListAdapter getMAdapter() {
        return null;
    }
    
    @javax.inject.Inject()
    public final void setMAdapter(@org.jetbrains.annotations.Nullable()
    com.example.kotlindemo.notes_app.NoteListAdapter p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.example.kotlindemo.notes_app.ui.fragment.NoteListFragment newInstance(@org.jetbrains.annotations.NotNull()
    java.lang.String param1, @org.jetbrains.annotations.NotNull()
    java.lang.String param2) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
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
    com.example.kotlindemo.notes_app.di.component.FragmentComponent buildComponent) {
    }
    
    @java.lang.Override()
    public void openAddNoteFragment() {
    }
    
    @java.lang.Override()
    public void openUpdateNoteFragment() {
    }
    
    private final void setUp() {
    }
    
    @java.lang.Override()
    public void updateNote(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String desc) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/kotlindemo/notes_app/ui/fragment/NoteListFragment$Companion;", "", "()V", "newInstance", "Lcom/example/kotlindemo/notes_app/ui/fragment/NoteListFragment;", "param1", "", "param2", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.example.kotlindemo.notes_app.ui.fragment.NoteListFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String param1, @org.jetbrains.annotations.NotNull()
        java.lang.String param2) {
            return null;
        }
    }
}