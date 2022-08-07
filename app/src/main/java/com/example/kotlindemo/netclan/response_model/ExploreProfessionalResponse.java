package com.example.kotlindemo.netclan.response_model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ExploreProfessionalResponse {

    @SerializedName("refresh_rate")
    @Expose
    private int refreshRate;
    @SerializedName("data")
    @Expose
    private List<ProfessionalModel> data = null;

    public Integer getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(Integer refreshRate) {
        this.refreshRate = refreshRate;
    }

    public List<ProfessionalModel> getData() {
        return data;
    }

    public void setData(List<ProfessionalModel> data) {
        this.data = data;
    }

    public class ProfessionalModel {

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

        @SerializedName("profession")
        @Expose
        private DataObject profession;

//        @SerializedName("invitationStatus")
//        @Expose
//        private Integer invitationStatus;

        @SerializedName("invStatus")
        @Expose
        private Integer invStatus;

        @SerializedName("profileScore")
        @Expose
        private Integer profileScore;

        @SerializedName("yearsOfExperience")
        @Expose
        private DataObject yearsOfExperience;

        @SerializedName("places")
        @Expose
        private PlaceList placeList;

        @SerializedName("isFromCloseContact")
        @Expose
        private boolean isFromCloseContact;

        @SerializedName("visibility")
        @Expose
        private Visibility visibility;

        public String getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        public PlaceList getPlaceList() {
            return placeList;
        }

        public void setPlaceList(PlaceList placeList) {
            this.placeList = placeList;
        }

        public DataObject getProfession() {
            return profession;
        }

        public void setProfession(DataObject profession) {
            this.profession = profession;
        }

        public DataObject getYearsOfExperience() {
            return yearsOfExperience;
        }

        public void setYearsOfExperience(DataObject yearsOfExperience) {
            this.yearsOfExperience = yearsOfExperience;
        }

        public Integer getProfileScore() {
            return profileScore;
        }

        public void setProfileScore(Integer profileScore) {
            this.profileScore = profileScore;
        }

        public Long getPhone() {
            return phone;
        }

        public void setPhone(Long phone) {
            this.phone = phone;
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

        public Integer getInvStatus() {
            return invStatus;
        }

        public void setInvStatus(Integer invStatus) {
            this.invStatus = invStatus;
        }

        public boolean isFromCloseContact() {
            return isFromCloseContact;
        }

        public void setFromCloseContact(boolean fromCloseContact) {
            isFromCloseContact = fromCloseContact;
        }

        public Visibility getVisibility() {
            return visibility;
        }

        public void setVisibility(Visibility visibility) {
            this.visibility = visibility;
        }
    }
}
