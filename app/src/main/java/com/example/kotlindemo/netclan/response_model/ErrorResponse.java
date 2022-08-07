package com.example.kotlindemo.netclan.response_model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ErrorResponse {

    @SerializedName("error")
    @Expose
    private String error;

    @SerializedName("errorMsg")
    @Expose
    private String errorMsg;

    public ErrorResponse(String error, String errorMsg) {
        this.error = error;
        this.errorMsg = errorMsg;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
