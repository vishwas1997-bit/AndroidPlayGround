package com.example.kotlindemo.netclan.response_model.getCloseContact;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetCloseContactResponse{
    @SerializedName("data")
    @Expose
    private List<DataInfo> data = null;

    public List<DataInfo> getData() {
        return data;
    }

    public void setData(List<DataInfo> data) {
        this.data = data;
    }




    public class DataInfo {
        @SerializedName("phone")
        @Expose
        private long phone;
        @SerializedName("fullName")
        @Expose
        private String fullName;
        @SerializedName("firstName")
        @Expose
        private String firstName;
        @SerializedName("lastName")
        @Expose
        private String lastName;
        @SerializedName("bio")
        @Expose
        private Bio bio;
        @SerializedName("userId")
        @Expose
        private String userId;
        @SerializedName("profilePicUrl")
        @Expose
        private String profileUrl;
        @SerializedName("userType")
        @Expose
        private  int userType;

        public int getUserType() {
            return userType;
        }

        public void setUserType(int userType) {
            this.userType = userType;
        }

        public String getProfileUrl() {
            return profileUrl;
        }

        public void setProfileUrl(String profileUrl) {
            this.profileUrl = profileUrl;
        }

        public long getPhone() {
            return phone;
        }

        public void setPhone(Integer phone) {
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

        public Bio getBio() {
            return bio;
        }

        public void setBio(Bio bio) {
            this.bio = bio;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }


    }

    public class Bio {
        @SerializedName("data")
        @Expose
        private String data;
        @SerializedName("status")
        @Expose
        private int status;

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }
    }
}
