package com.example.kotlindemo.netclan.response_model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ExploreMerchantResponse {

    @SerializedName("refresh_rate")
    @Expose
    private int refreshRate;
    @SerializedName("data")
    @Expose
    private List<MerchantModel> data = null;

    public Integer getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(Integer refreshRate) {
        this.refreshRate = refreshRate;
    }

    public List<MerchantModel> getData() {
        return data;
    }

    public void setData(List<MerchantModel> data) {
        this.data = data;
    }

    public class MerchantModel {
        //todo add phoneStatus

        @SerializedName("countryCode")
        @Expose
        private String countryCode;

        @SerializedName("phone")
        @Expose
        private Long phone;

        @SerializedName("bio")
        @Expose
        private Bio bio;

//    @SerializedName("fullName")
//    @Expose
//    private String fullName;

        @SerializedName("merchantName")
        @Expose
        private String merchantName;

        @SerializedName("gender")
        @Expose
        private Integer gender;

        @SerializedName("profilePicUrl")
        @Expose
        private String profilePicUrl;

        @SerializedName("startup")
        @Expose
        private Startup startup;

        @SerializedName("distanceAway")
        @Expose
        private Double distanceAway;

        @SerializedName("uid")
        @Expose
        private String uid;

        @SerializedName("invStatus")
        @Expose
        private Integer invitationStatus;

        @SerializedName("profileScore")
        @Expose
        private Integer profileScore;

        @SerializedName("places")
        @Expose
        private PlaceList placeList;

        @SerializedName("location")
        @Expose
        private Location location;

        @SerializedName("isFromCloseContact")
        @Expose
        private boolean isFromCloseContact;

        public String getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public String getMerchantName() {
            return merchantName;
        }

        public void setMerchantName(String merchantName) {
            this.merchantName = merchantName;
        }

        public Integer getProfileScore() {
            return profileScore;
        }

        public void setProfileScore(Integer profileScore) {
            this.profileScore = profileScore;
        }

        public PlaceList getPlaceList() {
            return placeList;
        }

        public void setPlaceList(PlaceList placeList) {
            this.placeList = placeList;
        }

        public Long getPhone() {
            return phone;
        }

        public void setPhone(Long phone) {
            this.phone = phone;
        }

        public Bio getBio() {
            return bio;
        }

        public void setBio(Bio bio) {
            this.bio = bio;
        }

        public void setStartup(Startup startup) {
            this.startup = startup;
        }

        public Startup getStartup() {
            return startup;
        }

//    public String getFullName() {
//        return fullName;
//    }
//
//    public void setFullName(String fullName) {
//        this.fullName = fullName;
//    }

        public Integer getGender() {
            return gender;
        }

        public void setGender(Integer gender) {
            this.gender = gender;
        }

        public String getProfilePicUrl() {
            return profilePicUrl;
        }

        public void setProfilePicUrl(String profilePicUrl) {
            this.profilePicUrl = profilePicUrl;
        }

        public Double getDistanceAway() {
            return distanceAway;
        }

        public void setDistanceAway(Double distanceAway) {
            this.distanceAway = distanceAway;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public Integer getInvitationStatus() {
            return invitationStatus;
        }

        public void setInvitationStatus(Integer invitationStatus) {
            this.invitationStatus = invitationStatus;
        }

        public boolean getIsFromCloseContact() {
            return isFromCloseContact;
        }

        public void setIsFromCloseContact(boolean isFromCloseContact) {
            this.isFromCloseContact = isFromCloseContact;
        }
    }
}
