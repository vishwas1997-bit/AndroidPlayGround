package com.example.kotlindemo.netclan.RoomForConnectionList;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "connection_table")
public class ConnectionEntity {

    @PrimaryKey
    @ColumnInfo(name = "_id")
    @NonNull
    private String id;

    @ColumnInfo(name = "inConnectionDataBase")
    private boolean inConnectionDataBase;

    @ColumnInfo(name = "fullPhone")
    private String fullPhone;

    public ConnectionEntity(String id, boolean inConnectionDataBase, String fullPhone) {
        this.id = id;
        this.inConnectionDataBase = inConnectionDataBase;
        this.fullPhone = fullPhone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isInConnectionDataBase() {
        return inConnectionDataBase;
    }

    public void setInConnectionDataBase(boolean inConnectionDataBase) {
        this.inConnectionDataBase = inConnectionDataBase;
    }

    public String getFullPhone() {
        return fullPhone;
    }

    public void setFullPhone(String fullPhone) {
        this.fullPhone = fullPhone;
    }
}
