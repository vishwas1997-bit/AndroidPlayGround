package com.example.kotlindemo.notes_app.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.kotlindemo.notes_app.data.model.NoteEntity
import io.reactivex.Observable

@Dao
interface NoteDao {

    @Query("SELECT * FROM notes_table ORDER BY local_id DESC")
    fun getNotesList(): Observable<List<NoteEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(notesEntity: NoteEntity?)

    @Query("delete from notes_table")
    fun deleteAllNotes()

}