package com.example.kotlindemo.notes_app

import com.example.kotlindemo.Utils.rxJava.SchedulerProvider
import com.example.kotlindemo.notes_app.data.DataManger
import com.example.kotlindemo.notes_app.ui.NoteNavigator
import com.example.kotlindemo.notes_app.ui.base.BaseViewModel

class NoteViewModel(dataManger: DataManger, schedulerProvider: SchedulerProvider)
    : BaseViewModel<NoteNavigator>(dataManger,schedulerProvider) {

    fun addNote(){
        getNavigator()?.openAddNoteFragment()
    }
}