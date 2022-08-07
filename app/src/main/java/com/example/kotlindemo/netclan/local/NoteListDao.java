package com.example.kotlindemo.netclan.local;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface NoteListDao {

    @Query("SELECT * FROM notes_table WHERE userId = :userId and deleteNoteFlag = :flag ORDER BY local_id DESC")
    LiveData<List<NotesEntity>> getNotesList(String userId , int flag);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(NotesEntity notesEntity);

    @Update(entity = NotesEntity.class)
    void updateEditNotes(NotesPartialEntityForUpdate... notesPartialEntityForUpdates);


    @Update(entity = NotesEntity.class)
    void delete(NotesPartialEntityForDelete... entityForDeletes);

    @Query("SELECT * FROM notes_table WHERE createNoteFlag = :flag")
    LiveData<List<NotesEntity>> getNotesWithCreateFlag(int flag);

    @Query("select * from notes_table where updateNoteFlag = :flag")
    LiveData<List<NotesEntity>> getNotesWithUpdateFlag(int flag);

    @Update(entity = NotesEntity.class)
    void updateCreateFlag(NotesEntityPartial... notesEntityPartials);

    @Query("SELECT * FROM notes_table WHERE userId = :userId")
    List<NotesEntity> getData(String userId);

    @Query("select * from notes_table where deleteNoteFlag = :flag")
    LiveData<List<NotesEntity>> getNotesWithDeleteFlag(int flag);

    @Query("delete from notes_table where local_id in (:notesEntity)")
    void deleteNoPermanently(List<Integer> notesEntity);

    @Query("delete from notes_table")
    void deleteAllNotes();

    @Query("select count(*) from notes_table")
    int getSize();
}
