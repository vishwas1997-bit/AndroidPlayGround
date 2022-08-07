package com.netclan.netclan.response_model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

//    "thumbnail": {
//        "url": "https://storage.googleapis.com/netclandev/thumbnails/thumbnail_1641929510882.jpeg",
//        "fileName": "thumbnails/thumbnail_1641929510882.jpeg"
//    }
data class ThumbnailResponse(
    @SerializedName("url") @Expose val thumbnailUrl: String,
    @SerializedName("fileName") @Expose val thumbnailFileName: String
)
