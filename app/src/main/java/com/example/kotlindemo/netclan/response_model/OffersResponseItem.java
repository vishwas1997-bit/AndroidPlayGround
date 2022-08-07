package com.example.kotlindemo.netclan.response_model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class OffersResponseItem {

    @SerializedName("offerImageUrl")
    @Expose
    private String offerImageUrl;

    @SerializedName("currency")
    @Expose
    private String currency;

    @SerializedName("isSelected")
    @Expose
    private Boolean isSelected;

    @SerializedName("_id")
    @Expose
    private String _id;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("price")
    @Expose
    private String price;

    @SerializedName("openLink")
    @Expose
    private String openLink;

    @SerializedName("startDate")
    @Expose
    private String startDate;

    @SerializedName("endDate")
    @Expose
    private String endDate;

    @SerializedName("totalCount")
    @Expose
    private Integer totalCount;

    @SerializedName("availableCount")
    @Expose
    private Integer availableCount;

    @SerializedName("userId")
    @Expose
    private String userId;

    @SerializedName("offerDesc")
    @Expose
    private ArrayList<String> offerDesc;

    public Boolean getSelected() {
        return isSelected;
    }

    public void setSelected(Boolean selected) {
        isSelected = selected;
    }

    public String getOfferImageUrl() {
        return offerImageUrl;
    }

    public void setOfferImageUrl(String offerImageUrl) {
        this.offerImageUrl = offerImageUrl;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOpenLink() {
        return openLink;
    }

    public void setOpenLink(String openLink) {
        this.openLink = openLink;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(Integer availableCount) {
        this.availableCount = availableCount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ArrayList<String> getOfferDesc() {
        return offerDesc;
    }

    public void setOfferDesc(ArrayList<String> offerDesc) {
        this.offerDesc = offerDesc;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
