package com.example.kotlindemo.netclan.response_model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConnectedAccountItem {
    @SerializedName("googleUserId")
    @Expose
    private String googleUserId;

    @SerializedName("facebookUserId")
    @Expose
    private String facebookUserId;

    @SerializedName("linkedInUserId")
    @Expose
    private String linkedInUserId;

    public ConnectedAccountItem(String googleUserId, String facebookUserId, String linkedInUserId) {
        this.googleUserId = googleUserId;
        this.facebookUserId = facebookUserId;
        this.linkedInUserId = linkedInUserId;
    }

    public String getGoogleUserId() {
        return googleUserId;
    }

    public void setGoogleUserId(String googleUserId) {
        this.googleUserId = googleUserId;
    }

    public String getFacebookUserId() {
        return facebookUserId;
    }

    public void setFacebookUserId(String facebookUserId) {
        this.facebookUserId = facebookUserId;
    }

    public String getLinkedInUserId() {
        return linkedInUserId;
    }

    public void setLinkedInUserId(String linkedInUserId) {
        this.linkedInUserId = linkedInUserId;
    }
}
