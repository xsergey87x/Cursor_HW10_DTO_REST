package com.cursor.hw10.service;

import com.cursor.hw10.entity.Shop;
import com.cursor.hw10.repository.ShopsRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@NoArgsConstructor
@Service
public class ShopServiceImpl implements ShopService {

    private ShopsRepository shopsRepository;

    public ShopServiceImpl(ShopsRepository shopsRepository) {
        this.shopsRepository = shopsRepository;
    }

    @Override
    public Shop createShop(Shop shop) {
        return shopsRepository.save(shop);
    }

    @Override
    public void deleteShop(Shop shop) {
        shopsRepository.delete(shop);
    }

    @Override
    public void deleteShopById(Long shopId) {
        Shop shop = shopsRepository.findById(shopId).get();
        deleteShop(shop);
    }

    @Override
    public List<Shop> getAllShops() {
        return shopsRepository.findAll();
    }

    @Override
    public Shop getShopById(Long shopId) {
        return shopsRepository.findById(shopId).get();
    }
}
