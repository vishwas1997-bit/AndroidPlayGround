package com.example.kotlindemo.netclan.response_model.type_converters;

import androidx.room.TypeConverter;

import com.example.kotlindemo.netclan.response_model.PlaceItem;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

public class PlaceItemTypeConverters {

    static Gson gson = new Gson();

    @TypeConverter
    public static List<PlaceItem> stringToPlaceItemsList(String data) {
        if (data == null) {
            return Collections.emptyList();
        }

        Type listType = new TypeToken<List<PlaceItem>>() {
        }.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public static String placeItemsListToString(List<PlaceItem> placeItems) {
        return gson.toJson(placeItems);
    }
}
