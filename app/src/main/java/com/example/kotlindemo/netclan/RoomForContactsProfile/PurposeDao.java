package com.example.kotlindemo.netclan.RoomForContactsProfile;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface PurposeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertPurpose(PurposeEntity purposeEntity);

    @Query("select * from purpose_table where userIdInPurposeTable=:userId")
    LiveData<List<PurposeEntity>> getPurpose(String userId);

    @Query("delete from purpose_table where userIdInPurposeTable =:userId")
    void delete(String userId);
}
