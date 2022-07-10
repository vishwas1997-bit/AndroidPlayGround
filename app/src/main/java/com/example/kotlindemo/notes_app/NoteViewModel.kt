package com.example.kotlindemo.notes_app

import com.example.kotlindemo.notes_app.ui.NoteNavigator
import com.example.kotlindemo.notes_app.ui.base.BaseViewModel

class NoteViewModel : BaseViewModel<NoteNavigator>() {

    fun addNote(){
        getNavigator()?.openAddNoteFragment()
    }
}