package com.example.kotlindemo.notes_app.data.db

import com.example.kotlindemo.notes_app.data.model.NoteEntity
import io.reactivex.Observable
import java.util.concurrent.Callable
import javax.inject.Inject

class AppDbHelper @Inject constructor(private val mDatabase: AppDatabase) : DbHelper{

    override fun getNoteList(): Observable<List<NoteEntity>> {
        return mDatabase.getNoteDao()!!.getNotesList()
    }

    override fun insertNote(noteEntity: NoteEntity): Observable<Boolean> {
        return Observable.fromCallable(Callable {
            mDatabase.getNoteDao()?.insert(noteEntity)
            return@Callable true
        })
    }

    override suspend fun updateNote(noteEntity: NoteEntity) {
        mDatabase.getNoteDao()?.updateNote(noteEntity)
    }
}