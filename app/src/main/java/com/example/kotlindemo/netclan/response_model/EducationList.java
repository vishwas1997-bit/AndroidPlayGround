package com.example.kotlindemo.netclan.response_model;

import androidx.room.ColumnInfo;
import androidx.room.TypeConverters;

import com.example.kotlindemo.netclan.response_model.type_converters.EducationItemTypeConverters;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EducationList {

    @ColumnInfo(name = "status")
    @SerializedName("status")
    @Expose
    private Integer status;

    @TypeConverters(EducationItemTypeConverters.class)
    @ColumnInfo(name = "data")
    @SerializedName("data")
    @Expose
    private List<EducationItem> data = null;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<EducationItem> getData() {
        return data;
    }

    public void setData(List<EducationItem> data) {
        this.data = data;
    }

}

