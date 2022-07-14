package com.example.kotlindemo.notes_app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0016\u00a8\u0006\u000f"}, d2 = {"Lcom/example/kotlindemo/notes_app/NoteListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/kotlindemo/notes_app/ui/base/BaseViewHolder;", "()V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "NoteListViewHolder", "app_debug"})
public final class NoteListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.kotlindemo.notes_app.ui.base.BaseViewHolder> {
    
    public NoteListAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.kotlindemo.notes_app.ui.base.BaseViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.kotlindemo.notes_app.ui.base.BaseViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/kotlindemo/notes_app/NoteListAdapter$NoteListViewHolder;", "Lcom/example/kotlindemo/notes_app/ui/base/BaseViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "onBind", "", "position", "", "app_debug"})
    public static final class NoteListViewHolder extends com.example.kotlindemo.notes_app.ui.base.BaseViewHolder {
        
        public NoteListViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @java.lang.Override()
        public void onBind(int position) {
        }
    }
}