package com.example.kotlindemo.netclan.response_model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ExploreIndividualResponse {

    @SerializedName("refresh_rate")
    @Expose
    private int refreshRate;
    @SerializedName("data")
    @Expose
    private List<IndividualModel> data = null;

    public Integer getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(Integer refreshRate) {
        this.refreshRate = refreshRate;
    }

    public List<IndividualModel> getData() {
        return data;
    }

    public void setData(List<IndividualModel> data) {
        this.data = data;
    }

    public class IndividualModel{

        @SerializedName("phone")
        @Expose
        private Long phone;

        @SerializedName("bio")
        @Expose
        private Bio bio;

        @SerializedName("places")
        @Expose
        private PlaceList placeList;

        @SerializedName("fullName")
        @Expose
        private String fullName;

        @SerializedName("firstName")
        @Expose
        private String firstName;

        @SerializedName("lastName")
        @Expose
        private String lastName;

        @SerializedName("gender")
        @Expose
        private int gender;

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

//        @SerializedName("invitationStatus")
//        @Expose
//        private Integer invitationStatus;

        @SerializedName("invStatus")
        @Expose
        private Integer invStatus;

        @SerializedName("profileScore")
        @Expose
        private Integer profileScore;

        @SerializedName("status")
        @Expose
        private Integer status;

        @SerializedName("isFromCloseContact")
        @Expose
        private boolean isFromCloseContact;

        @SerializedName("visibility")
        @Expose
        private Visibility visibility;

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        private boolean isActive;

        public boolean isActive() {
            return isActive;
        }

        public void setActive(boolean active) {
            isActive = active;
        }

        public Long getPhone() {
            return phone;
        }

        public void setPhone(Long phone) {
            this.phone = phone;
        }

        public Integer getProfileScore() {
            return profileScore;
        }

        public void setProfileScore(Integer profileScore) {
            this.profileScore = profileScore;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
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

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }

        public String getProfilePicUrl() {
            return profilePicUrl;
        }

        public void setProfilePicUrl(String profilePicUrl) {
            this.profilePicUrl = profilePicUrl;
        }

        public Bio getBio() {
            return bio;
        }

        public void setBio(Bio bio) {
            this.bio = bio;
        }

        public Startup getStartup() {
            return startup;
        }

        public void setStartup(Startup startup) {
            this.startup = startup;
        }

        public PlaceList getPlaceList() {
            return placeList;
        }

        public void setPlaceList(PlaceList placeList) {
            this.placeList = placeList;
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

//        public Integer getInvitationStatus() {
//            return invitationStatus;
//        }
//
//        public void setInvitationStatus(Integer invitationStatus) {
//            this.invitationStatus = invitationStatus;
//        }


        public Integer getInvitationStatus() {
            return invStatus;
        }

        public void setInvitationStatus(Integer invStatus) {
            this.invStatus = invStatus;
        }

        public boolean isFromCloseContact() {
            return isFromCloseContact;
        }

        public void setFromCloseContact(boolean fromCloseContact) {
            isFromCloseContact = fromCloseContact;
        }

        public Integer getInvStatus() {
            return invStatus;
        }

        public void setInvStatus(Integer invStatus) {
            this.invStatus = invStatus;
        }

        public Visibility getVisibility() {
            return visibility;
        }

        public void setVisibility(Visibility visibility) {
            this.visibility = visibility;
        }
    }

}
