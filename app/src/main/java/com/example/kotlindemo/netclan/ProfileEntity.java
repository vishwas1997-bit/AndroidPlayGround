package com.example.kotlindemo.netclan;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "profile_table")
public class ProfileEntity {

    @PrimaryKey
    @ColumnInfo(name = "_id")
    @NonNull
    private String id;

    @ColumnInfo(name = "inProfileDataBase")
    private boolean inProfileDataBase;

    public ProfileEntity(String id, boolean inProfileDataBase) {
        this.id = id;
        this.inProfileDataBase = inProfileDataBase;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isInProfileDataBase() {
        return inProfileDataBase;
    }

    public void setInProfileDataBase(boolean inProfileDataBase) {
        this.inProfileDataBase = inProfileDataBase;
    }
}
