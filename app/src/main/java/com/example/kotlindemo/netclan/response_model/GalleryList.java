package com.example.kotlindemo.netclan.response_model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class GalleryList {

    @SerializedName("data")
    @Expose
    private ArrayList<GalleryItem> data;

    public ArrayList<GalleryItem> getData() {
        return data;
    }

    public void setData(ArrayList<GalleryItem> data) {
        this.data = data;
    }
}
