package com.example.kotlindemo.netclan.response_model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "phone_contact_table")
public class PhoneContactTable {

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "fullPhone")
    private String fullPhone;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "photoUri")
    private String photoUri;

    public PhoneContactTable(@NonNull String name, @NonNull String fullPhone, String photoUri) {
        this.name = name;
        this.fullPhone = fullPhone;
        this.photoUri = photoUri;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    @NonNull
    public String getFullPhone() {
        return fullPhone;
    }

    public void setFullPhone(@NonNull String fullPhone) {
        this.fullPhone = fullPhone;
    }

    @NonNull
    public String getPhotoUri() {
        return photoUri;
    }

    public void setPhotoUri(@NonNull String photoUri) {
        this.photoUri = photoUri;
    }
}
