package com.example.kotlindemo.netclan.response_model.type_converters;

import androidx.room.TypeConverter;

import com.google.gson.Gson;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public class Converters {
    @TypeConverter
    public static String listToString(List<String> list) {
        return joinStringsWithSeparator(list, ";");
    }

    @TypeConverter
    public static List<String> stringToList(String str) {
        String[] arr = str.split(";");
        return Arrays.asList(arr);
    }


    public static String joinStringsWithSeparator(@NotNull List<String> list, @NotNull String separator) {
        if (list.size() == 0) return "";
        StringBuilder builder = new StringBuilder();
        for (String str : list) {
            builder.append(str);
            builder.append(separator);
        }
        String result = builder.toString();
        return result.substring(0, result.length() - separator.length());
    }


}
