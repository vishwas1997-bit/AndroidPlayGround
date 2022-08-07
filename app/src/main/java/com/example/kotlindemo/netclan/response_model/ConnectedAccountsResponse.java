package com.example.kotlindemo.netclan.response_model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConnectedAccountsResponse {

    @SerializedName("connectedAccounts")
    @Expose
    private ConnectedAccountItem connectedAccounts;

    public ConnectedAccountsResponse(ConnectedAccountItem connectedAccounts) {
        this.connectedAccounts = connectedAccounts;
    }

    public ConnectedAccountItem getConnectedAccounts() {
        return connectedAccounts;
    }

    public void setConnectedAccounts(ConnectedAccountItem connectedAccounts) {
        this.connectedAccounts = connectedAccounts;
    }
}
