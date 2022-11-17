package com.cursor.hw10.service;

import com.cursor.hw10.entity.Shop;

import java.util.List;

public interface ModelMappingService {

    Shop getShopFromJson (String json);

    String getJsonFromShop (List<Shop> shopList);


}
