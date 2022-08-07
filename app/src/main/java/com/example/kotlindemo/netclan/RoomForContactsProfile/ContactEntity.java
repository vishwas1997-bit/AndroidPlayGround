package com.example.kotlindemo.netclan.RoomForContactsProfile;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "contacts_table")
public class ContactEntity {

    @PrimaryKey
    @ColumnInfo(name = "_id")
    @NonNull
    private String id;

    @ColumnInfo(name = "inContactsDataBase")
    private boolean inContactsDataBase;

    @ColumnInfo(name = "fullPhone")
    private String fullPhone;


    public ContactEntity(String id, boolean inContactsDataBase,String fullPhone) {
        this.id = id;
        this.inContactsDataBase = inContactsDataBase;
        this.fullPhone = fullPhone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isInContactsDataBase() {
        return inContactsDataBase;
    }

    public void setInContactsDataBase(boolean inContactsDataBase) {
        this.inContactsDataBase = inContactsDataBase;
    }

    public String getFullPhone() {
        return fullPhone;
    }

    public void setFullPhone(String fullPhone) {
        this.fullPhone = fullPhone;
    }
}
