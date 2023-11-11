package com.example.kotlindemo.roomdatabase;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\'\u00a8\u0006\f"}, d2 = {"Lcom/example/kotlindemo/roomdatabase/DogDao;", "", "getDogsAndOwners", "", "Lcom/example/kotlindemo/roomdatabase/entity/ontoone/DogAndOwner;", "insertDog", "", "dog", "Lcom/example/kotlindemo/roomdatabase/entity/Dog;", "insertOwner", "owner", "Lcom/example/kotlindemo/roomdatabase/entity/Owner;", "app_debug"})
public abstract interface DogDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertDog(@org.jetbrains.annotations.NotNull
    com.example.kotlindemo.roomdatabase.entity.Dog dog);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertOwner(@org.jetbrains.annotations.NotNull
    com.example.kotlindemo.roomdatabase.entity.Owner owner);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Owner")
    @androidx.room.Transaction
    public abstract java.util.List<com.example.kotlindemo.roomdatabase.entity.ontoone.DogAndOwner> getDogsAndOwners();
}