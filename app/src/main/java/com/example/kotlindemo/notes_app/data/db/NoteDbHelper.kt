package com.example.kotlindemo.notes_app.data.db

import com.example.kotlindemo.notes_app.data.model.NoteEntity
import io.reactivex.Observable

class NoteDbHelper(var database: NoteDatabase) : NoteHelper{



    override fun getNoteList(): Observable<List<NoteEntity>> {
        TODO("Not yet implemented")
    }

    override fun insertNote(noteEntity: NoteEntity): Observable<Boolean> {
        TODO("Not yet implemented")
    }
}