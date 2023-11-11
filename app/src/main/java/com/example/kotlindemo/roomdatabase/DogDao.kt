package com.example.kotlindemo.roomdatabase

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import com.example.kotlindemo.roomdatabase.entity.Dog
import com.example.kotlindemo.roomdatabase.entity.Owner
import com.example.kotlindemo.roomdatabase.entity.ontoone.DogAndOwner

@Dao
interface DogDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertDog(dog: Dog)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertOwner(owner: Owner)

    @Transaction
    @Query("SELECT * FROM Owner")
    fun getDogsAndOwners(): List<DogAndOwner>
}