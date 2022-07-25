package com.example.kotlindemo.notes_app.ui.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001,B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010&\u001a\u00020 H\u0016J\b\u0010\'\u001a\u00020 H\u0016J\u0010\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020 H\u0002R(\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007@GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u0002X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R4\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012@GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/example/kotlindemo/notes_app/ui/fragment/NoteListFragment;", "Lcom/example/kotlindemo/notes_app/ui/base/BaseFragment;", "Lcom/example/kotlindemo/databinding/FragmentNoteListBinding;", "Lcom/example/kotlindemo/notes_app/NoteViewModel;", "Lcom/example/kotlindemo/notes_app/ui/NoteNavigator;", "()V", "<set-?>", "Lcom/example/kotlindemo/notes_app/NoteListAdapter;", "mAdapter", "getMAdapter", "()Lcom/example/kotlindemo/notes_app/NoteListAdapter;", "setMAdapter", "(Lcom/example/kotlindemo/notes_app/NoteListAdapter;)V", "mFragmentNoteListBinding", "getMFragmentNoteListBinding", "()Lcom/example/kotlindemo/databinding/FragmentNoteListBinding;", "setMFragmentNoteListBinding", "(Lcom/example/kotlindemo/databinding/FragmentNoteListBinding;)V", "Ljavax/inject/Provider;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "mLayoutManager", "getMLayoutManager", "()Ljavax/inject/Provider;", "setMLayoutManager", "(Ljavax/inject/Provider;)V", "param1", "", "param2", "getBindingVariable", "", "getLayoutId", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "openAddNoteFragment", "openUpdateNoteFragment", "performDependencyInjection", "buildComponent", "Lcom/example/kotlindemo/notes_app/di/component/FragmentComponent;", "setUp", "Companion", "app_debug"})
public final class NoteListFragment extends com.example.kotlindemo.notes_app.ui.base.BaseFragment<com.example.kotlindemo.databinding.FragmentNoteListBinding, com.example.kotlindemo.notes_app.NoteViewModel> implements com.example.kotlindemo.notes_app.ui.NoteNavigator {
    public com.example.kotlindemo.databinding.FragmentNoteListBinding mFragmentNoteListBinding;
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
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kotlindemo.databinding.FragmentNoteListBinding getMFragmentNoteListBinding() {
        return null;
    }
    
    public final void setMFragmentNoteListBinding(@org.jetbrains.annotations.NotNull()
    com.example.kotlindemo.databinding.FragmentNoteListBinding p0) {
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