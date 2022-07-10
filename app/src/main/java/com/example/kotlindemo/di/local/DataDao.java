package com.example.kotlindemo.di.local;

import static androidx.room.OnConflictStrategy.REPLACE;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DataDao {

    @Insert(onConflict = REPLACE)
    void insert(DataEntity data);


    @Query("SELECT * FROM data_table ")
    List<DataEntity> getNoteList();
}
