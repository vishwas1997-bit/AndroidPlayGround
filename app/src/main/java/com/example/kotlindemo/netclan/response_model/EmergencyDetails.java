package com.example.kotlindemo.netclan.response_model;

import androidx.room.ColumnInfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EmergencyDetails {

    @ColumnInfo(name = "bloodGroup")
    @SerializedName("bloodGroup")
    @Expose
    private String bloodGroup;

    @ColumnInfo(name = "doctorContact")
    @SerializedName("doctorContact")
    @Expose
    private String doctorContact;

    @ColumnInfo(name = "insuranceAgent")
    @SerializedName("insuranceAgent")
    @Expose
    private String insuranceAgent;

    @ColumnInfo(name = "insuranceContact")
    @SerializedName("insuranceContact")
    @Expose
    private String insuranceContact;

    @ColumnInfo(name = "emergencyContact")
    @SerializedName("emergencyContact")
    @Expose
    private String emergencyContact;

    @ColumnInfo(name = "status")
    @SerializedName("status")
    @Expose
    private Integer status;

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getDoctorContact() {
        return doctorContact;
    }

    public void setDoctorContact(String doctorContact) {
        this.doctorContact = doctorContact;
    }

    public String getInsuranceAgent() {
        return insuranceAgent;
    }

    public void setInsuranceAgent(String insuranceAgent) {
        this.insuranceAgent = insuranceAgent;
    }

    public String getInsuranceContact() {
        return insuranceContact;
    }

    public void setInsuranceContact(String insuranceContact) {
        this.insuranceContact = insuranceContact;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
