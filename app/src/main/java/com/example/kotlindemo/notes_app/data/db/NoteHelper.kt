package com.example.kotlindemo.notes_app.data.db

import com.example.kotlindemo.notes_app.data.model.NoteEntity
import io.reactivex.Observable

interface NoteHelper {

    fun getNoteList() : Observable<List<NoteEntity>>

    fun insertNote(noteEntity: NoteEntity) : Observable<Boolean>
}