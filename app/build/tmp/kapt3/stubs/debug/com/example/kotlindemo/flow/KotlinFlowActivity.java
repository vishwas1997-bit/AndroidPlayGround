package com.example.kotlindemo.flow;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0002J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/kotlindemo/flow/KotlinFlowActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/kotlindemo/databinding/ActivityKotlinFlowBinding;", "searchQueryFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "debouncingWithStateFlow", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "performSearch", "query", "app_debug"})
public final class KotlinFlowActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.kotlindemo.databinding.ActivityKotlinFlowBinding binding;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> searchQueryFlow = null;
    private java.util.HashMap _$_findViewCache;
    
    public KotlinFlowActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void debouncingWithStateFlow() {
    }
    
    private final void performSearch(java.lang.String query) {
    }
}