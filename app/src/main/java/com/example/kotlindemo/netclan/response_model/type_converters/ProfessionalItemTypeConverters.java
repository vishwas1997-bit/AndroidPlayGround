package com.example.kotlindemo.netclan.response_model.type_converters;

import androidx.room.TypeConverter;

import com.example.kotlindemo.netclan.response_model.ProfessionItem;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

public class ProfessionalItemTypeConverters {

    static Gson gson = new Gson();

    @TypeConverter
    public static List<ProfessionItem> stringToProfessionItemsList(String data) {
        if (data == null) {
            return Collections.emptyList();
        }

        Type listType = new TypeToken<List<ProfessionItem>>() {
        }.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public static String professionItemsListToString(List<ProfessionItem> professionItems) {
        return gson.toJson(professionItems);
    }
}
