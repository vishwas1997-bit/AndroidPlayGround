package com.example.kotlindemo.netclan.response_model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class GalleryItem implements Serializable {

    @SerializedName("name")
    @Expose
    private String fileName;

    @SerializedName("fileLink")
    @Expose
    private String fileLink;
    @SerializedName("fileCategory")
    @Expose
    private String fileCategory;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;

    //on fragment load check if file exists locally and set download status for all items-done
    //on download start update status
    //on download complete update status
    //on download failed update status
    private int downloadStatus;

    //on fragment load check if file exists locally and add its path here-done
    //on download complete update path here
    private String localPath;

    public GalleryItem(String fileName, String fileLink, String fileCategory) {
        this.fileName = fileName;
        this.fileLink = fileLink;
        this.fileCategory = fileCategory;
    }

    public int getDownloadStatus() {
        return downloadStatus;
    }

    public void setDownloadStatus(int downloadStatus) {
        this.downloadStatus = downloadStatus;
    }

    public String getLocalPath() {
        return localPath;
    }

    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileLink() {
        return fileLink;
    }

    public void setFileLink(String fileLink) {
        this.fileLink = fileLink;
    }

    public String getFileCategory() {
        return fileCategory;
    }

    public void setFileCategory(String fileCategory) {
        this.fileCategory = fileCategory;
    }
}
