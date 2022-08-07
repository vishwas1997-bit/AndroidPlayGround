package com.example.kotlindemo.netclan.response_model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProfessionItem {

    @SerializedName("companyName")
    @Expose
    private String companyName;
    @SerializedName("designation")
    @Expose
    private String designation;
    @SerializedName("place")
    @Expose
    private String place;
    @SerializedName("startYear")
    @Expose
    private String startYear;
    @SerializedName("endYear")
    @Expose
    private String endYear;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("employmentType")
    @Expose
    private String employmentType;

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    public String getEndYear() {
        return endYear;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }

}
