package com.example.kotlindemo.netclan.response_model.type_converters;

import androidx.room.TypeConverter;

import com.example.kotlindemo.netclan.response_model.SocialItem;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

public class SocialItemTypeConverters {

    static Gson gson = new Gson();

    @TypeConverter
    public static List<SocialItem> stringToSocialItemsList(String data) {
        if (data == null) {
            return Collections.emptyList();
        }

        Type listType = new TypeToken<List<SocialItem>>() {
        }.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public static String socialItemsListToString(List<SocialItem> socialItems) {
        return gson.toJson(socialItems);
    }
}
