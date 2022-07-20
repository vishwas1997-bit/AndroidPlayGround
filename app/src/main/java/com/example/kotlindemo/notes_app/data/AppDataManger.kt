package com.example.kotlindemo.notes_app.data

import com.example.kotlindemo.notes_app.data.db.DbHelper
import com.example.kotlindemo.notes_app.data.model.NoteEntity
import dagger.Provides
import io.reactivex.Observable
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppDataManger @Inject constructor(private val mDbHelper: DbHelper) : DataManger {

    override fun insertNote(noteEntity: NoteEntity): Observable<Boolean> {
        return mDbHelper.insertNote(noteEntity)
    }

    override fun getNoteList(): Observable<List<NoteEntity>> {
        return mDbHelper.getNoteList()
    }
}