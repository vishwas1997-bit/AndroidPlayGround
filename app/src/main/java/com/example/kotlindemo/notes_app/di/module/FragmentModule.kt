package com.example.kotlindemo.notes_app.di.module

import androidx.core.util.Supplier
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlindemo.Utils.rxJava.SchedulerProvider
import com.example.kotlindemo.notes_app.NoteViewModel
import com.example.kotlindemo.notes_app.ViewModelProviderFactory
import com.example.kotlindemo.notes_app.data.DataManger
import com.example.kotlindemo.notes_app.ui.base.BaseFragment
import dagger.Module
import dagger.Provides

@Module
class FragmentModule(val fragment: BaseFragment<*,*>) {

    @Provides
    fun provideNoteViewModel(dataManger: DataManger, schedulerProvider: SchedulerProvider) : NoteViewModel{
        val supplier : Supplier<NoteViewModel> = Supplier {
            NoteViewModel(dataManger,schedulerProvider)
        }
        val factory :ViewModelProviderFactory<NoteViewModel> = ViewModelProviderFactory(NoteViewModel::class.java,supplier)
        return ViewModelProvider(fragment,factory)[NoteViewModel::class.java]
    }

    @Provides
    fun provideLinearLayoutManager() : LinearLayoutManager{
        return LinearLayoutManager(fragment.activity)
    }
}