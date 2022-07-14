package com.example.kotlindemo.notes_app.data.db

import com.example.kotlindemo.notes_app.data.model.NoteEntity
import io.reactivex.Observable
import java.util.concurrent.Callable
import javax.inject.Inject

class NoteDbHelper(var mDatabase: NoteDatabase) : NoteHelper{



    override fun getNoteList(): Observable<List<NoteEntity>> {
        return mDatabase.NoteDao()!!.getNotesList()
    }

    override fun insertNote(noteEntity: NoteEntity): Observable<Boolean> {
        return Observable.fromCallable(Callable {
            mDatabase.NoteDao()?.insert(noteEntity)
            return@Callable true
        })
    }
}