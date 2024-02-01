package com.example.phat_store.utilities;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonBuilderUtil {
    public static String getJson(Object resp) {
        GsonBuilder builder = new GsonBuilder();
        Gson responce = builder.create();
        return responce.toJson(resp);
    }
}
