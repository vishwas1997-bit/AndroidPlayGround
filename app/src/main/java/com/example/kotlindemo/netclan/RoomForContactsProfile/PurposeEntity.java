package com.example.kotlindemo.netclan.RoomForContactsProfile;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "purpose_table")
public class PurposeEntity {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int id;

    @ColumnInfo(name = "userIdInPurposeTable")
    private String userId;

    @ColumnInfo(name = "purposeType")
    private String purposeType;

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

    public String getPurposeType() {
        return purposeType;
    }

    public void setPurposeType(String purposeType) {
        this.purposeType = purposeType;
    }
}
