package com.cursor.hw10.service;

import com.cursor.hw10.entity.Shop;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Service
public class ShopServiceImpl implements ShopService{

    private MappingService mappingService;


    @Override
    public Shop createShop(Shop shop) {

        return shop;
    }

    @Override
    public void deleteShop(Shop shop) {

    }

    @Override
    public void deleteShopById(Long shopId) {

    }

    @Override
    public List<Shop> getAllShops() {
        return null;
    }

    @Override
    public Shop getShopById(Long shopId) {
        return null;
    }
}
