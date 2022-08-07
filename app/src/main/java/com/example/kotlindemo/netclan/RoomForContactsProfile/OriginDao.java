package com.example.kotlindemo.netclan.RoomForContactsProfile;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;

@Dao
public interface OriginDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertOrigin(OriginEntity originEntity);
}
