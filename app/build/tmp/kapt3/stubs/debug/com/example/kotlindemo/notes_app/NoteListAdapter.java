package com.example.kotlindemo.notes_app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0015\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/kotlindemo/notes_app/NoteListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/kotlindemo/notes_app/ui/base/BaseViewHolder;", "mNoteList", "", "Lcom/example/kotlindemo/notes_app/data/model/NoteEntity;", "(Ljava/util/List;)V", "addItems", "", "noteData", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "NoteListViewHolder", "app_debug"})
public final class NoteListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.kotlindemo.notes_app.ui.base.BaseViewHolder> {
    private java.util.List<com.example.kotlindemo.notes_app.data.model.NoteEntity> mNoteList;
    
    public NoteListAdapter() {
        super();
    }
    
    public NoteListAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kotlindemo.notes_app.data.model.NoteEntity> mNoteList) {
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
    
    public final void addItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kotlindemo.notes_app.data.model.NoteEntity> noteData) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/example/kotlindemo/notes_app/NoteListAdapter$NoteListViewHolder;", "Lcom/example/kotlindemo/notes_app/ui/base/BaseViewHolder;", "binding", "Lcom/example/kotlindemo/databinding/NoteItemBinding;", "(Lcom/example/kotlindemo/notes_app/NoteListAdapter;Lcom/example/kotlindemo/databinding/NoteItemBinding;)V", "getBinding", "()Lcom/example/kotlindemo/databinding/NoteItemBinding;", "onBind", "", "position", "", "app_debug"})
    public final class NoteListViewHolder extends com.example.kotlindemo.notes_app.ui.base.BaseViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.kotlindemo.databinding.NoteItemBinding binding = null;
        
        public NoteListViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.kotlindemo.databinding.NoteItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.kotlindemo.databinding.NoteItemBinding getBinding() {
            return null;
        }
        
        @java.lang.Override()
        public void onBind(int position) {
        }
    }
}