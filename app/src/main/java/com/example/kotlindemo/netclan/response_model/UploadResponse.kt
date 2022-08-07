package com.netclan.netclan.response_model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

//{
//    "fileUrl": "https://netclantest.storage.googleapis.com/tmp/video/71c0cddf-7e57-44fc-b265-f25eb26f27e3.mp4",
//    "filename": "tmp/video/71c0cddf-7e57-44fc-b265-f25eb26f27e3.mp4",
//    "originalname": "mylivewallpapers.com-Spider-Man-Miles.mp4",
//    "thumbnail": {
//        "url": "https://storage.googleapis.com/netclandev/thumbnails/thumbnail_1641929510882.jpeg",
//        "fileName": "thumbnails/thumbnail_1641929510882.jpeg"
//    }
//}
data class UploadResponse(
    @SerializedName("fileUrl") @Expose val fileUrl: String,
    @SerializedName("filename") @Expose val fileName: String,
    @SerializedName("originalname") @Expose val originalName: String,
    @SerializedName("thumbnail") @Expose val thumbnail: ThumbnailResponse
)
