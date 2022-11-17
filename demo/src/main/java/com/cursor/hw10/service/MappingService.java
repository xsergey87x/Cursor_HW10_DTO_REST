package com.cursor.hw10.service;

import com.cursor.hw10.dto.ShopDTO;
import com.cursor.hw10.entity.Shop;

import java.util.List;

public interface MappingService {

    List<ShopDTO> getAllShopsDto();

    public ShopDTO convertEntityToDto(Shop shop);


}
