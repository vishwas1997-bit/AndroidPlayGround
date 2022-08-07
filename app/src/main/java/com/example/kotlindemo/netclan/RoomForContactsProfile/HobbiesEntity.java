package com.example.kotlindemo.netclan.RoomForContactsProfile;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "hobbies_table")
public class HobbiesEntity {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int id;

    @ColumnInfo(name = "userIdInHobbiesTable")
    private String userId;

    @ColumnInfo(name = "hobbiesType")
    private String hobbiesType;


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

    public String getHobbiesType() {
        return hobbiesType;
    }

    public void setHobbiesType(String hobbiesType) {
        this.hobbiesType = hobbiesType;
    }
}
