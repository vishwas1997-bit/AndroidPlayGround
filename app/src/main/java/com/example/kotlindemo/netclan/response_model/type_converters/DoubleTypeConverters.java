package com.example.kotlindemo.netclan.response_model.type_converters;

import androidx.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

public class DoubleTypeConverters {

    static Gson gson = new Gson();

    @TypeConverter
    public static List<Double> stringToDoubleList(String data) {
        if (data == null) {
            return Collections.emptyList();
        }

        Type listType = new TypeToken<List<Double>>() {
        }.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public static String doubleListToString(List<Double> doubles) {
        return gson.toJson(doubles);
    }
}
