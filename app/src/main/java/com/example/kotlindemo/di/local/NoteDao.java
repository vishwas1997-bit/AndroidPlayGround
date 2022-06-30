package com.example.kotlindemo.di.local;

import static androidx.room.OnConflictStrategy.REPLACE;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface NoteDao {

    @Insert(onConflict = REPLACE)
    void insert(NoteEntity data);


    @Query("SELECT * FROM note_entity ")
    List<NoteEntity> getNoteList();
}
