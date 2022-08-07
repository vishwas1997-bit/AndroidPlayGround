package com.example.kotlindemo.netclan.response_model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EducationItem {


    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("institutionName")
    @Expose
    private String institutionName;
    @SerializedName("courseName")
    @Expose
    private String courseName;
    @SerializedName("courseDetail")
    @Expose
    private String courseDetail;
    @SerializedName("startYear")
    @Expose
    private String startYear;
    @SerializedName("endYear")
    @Expose
    private String endYear;
    @SerializedName("status")
    @Expose
    private Integer status;

    @SerializedName("grades")
    @Expose
    private String grades;

    @SerializedName("clubs")
    @Expose
    private String clubs;

    @SerializedName("description")
    @Expose
    private String description;

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    public String getClubs() {
        return clubs;
    }

    public void setClubs(String clubs) {
        this.clubs = clubs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDetail() {
        return courseDetail;
    }

    public void setCourseDetail(String courseDetail) {
        this.courseDetail = courseDetail;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
