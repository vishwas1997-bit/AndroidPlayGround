package com.example.kotlindemo.netclan.response_model;

import androidx.room.ColumnInfo;
import androidx.room.TypeConverters;

import com.example.kotlindemo.netclan.response_model.type_converters.PlaceItemTypeConverters;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PlaceList {

    @TypeConverters(PlaceItemTypeConverters.class)
    @ColumnInfo(name = "data")
    @SerializedName("data")
    @Expose
    private List<PlaceItem> data = null;

    @ColumnInfo(name = "status")
    @SerializedName("status")
    @Expose
    private Integer status;

    public List<PlaceItem> getData() {
        return data;
    }

    public void setData(List<PlaceItem> data) {
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


}