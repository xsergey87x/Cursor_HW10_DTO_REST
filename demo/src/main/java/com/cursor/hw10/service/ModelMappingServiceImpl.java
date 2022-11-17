package com.cursor.hw10.service;

import com.cursor.hw10.entity.Shop;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

public class ModelMappingServiceImpl implements ModelMappingService{
    @Override
    public Shop getShopFromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json,Shop.class);
    }

    @Override
    public String getJsonFromShop(List<Shop> shopList) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonStr = gson.toJson(shopList);
        return jsonStr;
    }
}
