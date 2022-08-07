package com.example.kotlindemo.netclan.response_model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class OffersList {

    @SerializedName("data")
    @Expose
    private ArrayList<OffersResponseItem> data;

    public ArrayList<OffersResponseItem> getData() {
        return data;
    }

    public void setData(ArrayList<OffersResponseItem> data) {
        this.data = data;
    }
}
