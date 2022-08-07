package com.example.kotlindemo.netclan.response_model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserRegisterResponse {

    @SerializedName("isNewUser")
    @Expose
    private boolean isNewUser;

    @SerializedName("authKey")
    @Expose
    private String authKey;

    @SerializedName("userId")
    @Expose
    private String userId;

    @SerializedName("loginProgress")
    @Expose
    private int loginProgress;

    @SerializedName("userType")
    @Expose
    private int userType;

    private String firebaseToken;

    public String getFirebaseToken() {
        return firebaseToken;
    }

    public void setFirebaseToken(String firebaseToken) {
        this.firebaseToken = firebaseToken;
    }

    public UserRegisterResponse(boolean isNewUser, String authKey, String userId, int loginProgress, int userType) {
        this.isNewUser = isNewUser;
        this.authKey = authKey;
        this.userId = userId;
        this.loginProgress = loginProgress;
        this.userType = userType;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getLoginProgress() {
        return loginProgress;
    }

    public void setLoginProgress(int loginProgress) {
        this.loginProgress = loginProgress;
    }

    public boolean isNewUser() {
        return isNewUser;
    }

    public void setNewUser(boolean newUser) {
        isNewUser = newUser;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }
}
