package com.example.kotlindemo.netclan.response_model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UpdateResponse {

    @SerializedName("result")
    @Expose
    private String result;

    private int code;

    public UpdateResponse(String result) {
        this.result = result;
    }

    public UpdateResponse(String result, int code) {
        this.result = result;
        this.code = code;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


    public class LocationUpdate{

        @SerializedName("result")
        @Expose
        private String result;

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }
    }

    public class UpdateOffer {
        @SerializedName("result")
        @Expose
        private String result;

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }
    }
}
