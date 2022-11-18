package com.cursor.hw10.service;

import com.cursor.hw10.dto.ShopDTO;
import com.cursor.hw10.entity.Shop;
import com.cursor.hw10.repository.ShopsRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Service
public class MappingServiceImpl implements MappingService {

    private ShopsRepository shopsRepository;

    public MappingServiceImpl(ShopsRepository shopsRepository) {
        this.shopsRepository = shopsRepository;
    }

    @Override
    public List<ShopDTO> getAllShopsDto() {
        return (List<ShopDTO>) shopsRepository
                .findAll()
                .stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public ShopDTO convertEntityToDto(Shop shop) {
        ShopDTO shopDto = new ShopDTO();

        shopDto.setId(shop.getId());
        shopDto.setNameShop(shop.getNameShop());
        shopDto.setStreet(shop.getStreet());
        shopDto.setCity(shop.getCity());
        shopDto.setSiteExist(shop.isSiteExist());
        return null;
    }
}
