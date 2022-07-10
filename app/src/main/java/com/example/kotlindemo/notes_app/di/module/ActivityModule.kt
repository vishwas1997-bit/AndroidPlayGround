package com.example.kotlindemo.notes_app.di.module

import androidx.core.util.Supplier
import androidx.lifecycle.ViewModelProvider
import com.example.kotlindemo.notes_app.NoteViewModel
import com.example.kotlindemo.notes_app.ViewModelProviderFactory
import com.example.kotlindemo.notes_app.ui.base.BaseActivity
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(var activity: BaseActivity<*, *>) {


    @Provides
    fun provideNoteViewModel() : NoteViewModel{
        val supplier: Supplier<NoteViewModel> = Supplier {
                NoteViewModel()
            }
        val factory: ViewModelProviderFactory<NoteViewModel> = ViewModelProviderFactory(NoteViewModel::class.java, supplier)
        return ViewModelProvider(activity, factory)[NoteViewModel::class.java]
    }
}