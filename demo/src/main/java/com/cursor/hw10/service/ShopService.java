package com.cursor.hw10.service;

import com.cursor.hw10.entity.Shop;

import java.util.List;

public interface ShopService {

    void createShop(Shop shop);

    void deleteShop(Shop shop);
    void deleteShopById(Long shopId);

    List<Shop> getAllShops();
    Shop getShopById(Long shopId);
}
