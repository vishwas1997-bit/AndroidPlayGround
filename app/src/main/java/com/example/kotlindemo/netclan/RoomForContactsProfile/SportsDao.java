package com.example.kotlindemo.netclan.RoomForContactsProfile;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;

@Dao
public interface SportsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertSporst(SportsEntity sportsEntity);
}
