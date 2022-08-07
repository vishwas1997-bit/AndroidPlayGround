package com.example.kotlindemo.netclan.response_model;

import androidx.room.ColumnInfo;
import androidx.room.TypeConverters;

import com.example.kotlindemo.netclan.response_model.type_converters.SocialItemTypeConverters;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SocialList {

    @TypeConverters(SocialItemTypeConverters.class)
    @ColumnInfo(name = "data")
    @SerializedName("data")
    @Expose
    private List<SocialItem> data = null;

    @ColumnInfo(name = "status")
    @SerializedName("status")
    @Expose
    private Integer status;

    public List<SocialItem> getData() {
        return data;
    }

    public void setData(List<SocialItem> data) {
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}