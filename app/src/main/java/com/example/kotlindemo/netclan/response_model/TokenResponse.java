package com.example.kotlindemo.netclan.response_model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TokenResponse {
    @SerializedName("authKey")
    @Expose
    private String authKey;

    @SerializedName("loginProgress")
    @Expose
    private String loginProgress;

    @SerializedName("userId")
    @Expose
    private String userId;

    public TokenResponse(String authKey) {
        this.authKey = authKey;
    }

    public String getLoginProgress() {
        return loginProgress;
    }

    public void setLoginProgress(String loginProgress) {
        this.loginProgress = loginProgress;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }
}
