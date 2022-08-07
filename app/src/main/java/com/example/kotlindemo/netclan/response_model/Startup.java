package com.example.kotlindemo.netclan.response_model;

import androidx.room.ColumnInfo;
import androidx.room.TypeConverters;

import com.example.kotlindemo.netclan.response_model.type_converters.StringTypeConverters;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Startup {

    @ColumnInfo(name = "nearByRadius")
    @SerializedName("nearByRadius")
    @Expose
    private Integer nearByRadius;

    @TypeConverters(StringTypeConverters.class)
    @ColumnInfo(name = "purpose")
    @SerializedName("purpose")
    @Expose
    private List<String> purpose;

    @ColumnInfo(name = "status")
    @SerializedName("status")
    @Expose
    private int status;

    @ColumnInfo(name = "wishlist")
    @SerializedName("wishlist")
    @Expose
    private String wishlist;

    public Integer getNearByRadius() {
        return nearByRadius;
    }

    public void setNearByRadius(Integer nearByRadius) {
        this.nearByRadius = nearByRadius;
    }

    public List<String> getPurpose() {
        return purpose;
    }

    public void setPurpose(List<String> purpose) {
        this.purpose = purpose;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getWishlist() {
        return wishlist;
    }

    public void setWishlist(String wishlist) {
        this.wishlist = wishlist;
    }

}