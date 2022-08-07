package com.example.kotlindemo.netclan.response_model;

import androidx.room.ColumnInfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataObject {

    @ColumnInfo(name = "data")
    @SerializedName("data")
    @Expose
    private String data;

    @ColumnInfo(name = "status")
    @SerializedName("status")
    @Expose
    private Integer status;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}