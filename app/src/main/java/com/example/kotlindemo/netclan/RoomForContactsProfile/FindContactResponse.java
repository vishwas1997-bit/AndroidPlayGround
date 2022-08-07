package com.example.kotlindemo.netclan.RoomForContactsProfile;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "find_contact_response")
public class FindContactResponse {

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "fullPhone")
    @SerializedName("fullPhone")
    @Expose
    private String fullPhone;

    @ColumnInfo(name = "_id")
    @SerializedName("_id")
    @Expose
    private String id;

    @ColumnInfo(name = "phone")
    @SerializedName("phone")
    @Expose
    private Long phone;

    @ColumnInfo(name = "firstName")
    @SerializedName("firstName")
    @Expose
    private String firstName;

    @ColumnInfo(name = "lastName")
    @SerializedName("lastName")
    @Expose
    private String lastName;

    @ColumnInfo(name = "profilePicUrl")
    @SerializedName("profilePicUrl")
    @Expose
    private String profilePicUrl;

    @ColumnInfo(name = "userType")
    @SerializedName("userType")
    @Expose
    private Integer userType;

    @ColumnInfo(name = "invStatus")
    @SerializedName("invStatus")
    @Expose
    private int invStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getFullPhone() {
        return fullPhone;
    }

    public void setFullPhone(String fullPhone) {
        this.fullPhone = fullPhone;
    }

    public int getInvStatus() {
        return invStatus;
    }

    public void setInvStatus(int invStatus) {
        this.invStatus = invStatus;
    }
}
