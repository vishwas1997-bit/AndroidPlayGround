package com.example.kotlindemo.netclan.RoomForContactsProfile;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;


@Dao
public interface MoviesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertMovies(MoviesEntity moviesEntity);

}
