package com.example.kotlindemo.notes_app.data.db.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.kotlindemo.notes_app.data.model.NoteEntity
import io.reactivex.Observable

interface NoteDao {

    @Query("SELECT * FROM notes_table ORDER BY local_id DESC")
    fun getNotesList(): Observable<List<NoteEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(notesEntity: NoteEntity?)

    @Query("delete from notes_table")
    fun deleteAllNotes()

}