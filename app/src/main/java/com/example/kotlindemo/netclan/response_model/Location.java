package com.example.kotlindemo.netclan.response_model;

import androidx.room.ColumnInfo;
import androidx.room.TypeConverters;

import com.example.kotlindemo.netclan.response_model.type_converters.DoubleTypeConverters;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Location {

    @TypeConverters(DoubleTypeConverters.class)
    @ColumnInfo(name = "coordinates")
    @SerializedName("coordinates")
    @Expose
    private List<Double> coordinates = null;

    public List<Double> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Double> coordinates) {
        this.coordinates = coordinates;
    }

}