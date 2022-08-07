package com.example.kotlindemo.netclan.response_model;

import androidx.room.ColumnInfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Visibility {

    @ColumnInfo(name = "dob_status")
    @SerializedName("dob")
    @Expose
    private Integer dob;

    @ColumnInfo(name = "profilePic_status")
    @SerializedName("profilePic")
    @Expose
    private Integer profilePic;

    public Integer getDob() {
        return dob;
    }

    public void setDob(Integer dob) {
        this.dob = dob;
    }

    public Integer getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(Integer profilePic) {
        this.profilePic = profilePic;
    }
}
