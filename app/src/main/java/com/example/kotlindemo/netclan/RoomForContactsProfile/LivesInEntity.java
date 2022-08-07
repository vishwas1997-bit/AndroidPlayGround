package com.example.kotlindemo.netclan.RoomForContactsProfile;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "livesIn_table")
public class LivesInEntity {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int id;

    @ColumnInfo(name = "userIdInLivesInTable")
    private String userId;

    @ColumnInfo(name = "livesIn")
    private String livesIn;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLivesIn() {
        return livesIn;
    }

    public void setLivesIn(String livesIn) {
        this.livesIn = livesIn;
    }
}
