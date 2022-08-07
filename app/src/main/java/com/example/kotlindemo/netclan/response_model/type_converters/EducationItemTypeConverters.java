package com.example.kotlindemo.netclan.response_model.type_converters;

import androidx.room.TypeConverter;

import com.example.kotlindemo.netclan.response_model.EducationItem;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

public class EducationItemTypeConverters {

    static Gson gson = new Gson();

    @TypeConverter
    public static List<EducationItem> stringToEducationItemsList(String data) {
        if (data == null) {
            return Collections.emptyList();
        }

        Type listType = new TypeToken<List<EducationItem>>() {
        }.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public static String educationItemsListToString(List<EducationItem> educationItems) {
        return gson.toJson(educationItems);
    }
}
