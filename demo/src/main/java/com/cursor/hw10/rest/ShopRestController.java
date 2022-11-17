package com.cursor.hw10.rest;


import com.cursor.hw10.dto.ShopDTO;
import com.cursor.hw10.entity.Shop;
import com.cursor.hw10.service.MappingService;
import com.cursor.hw10.service.ShopService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@RestController
@RequestMapping(value = "/shop")
public class ShopRestController {

    private final ShopService shopService;
    private final MappingService mappingService;

    public ShopRestController(ShopService shopService, MappingService mappingService) {
        this.shopService = shopService;
        this.mappingService = mappingService;
    }

    @GetMapping(value = "/getAll")
    public List<Shop> getAllShops(HttpServletResponse response) throws IOException {
        return shopService.getAllShops() ;
    }

    @GetMapping(value = "/getAllDto")
    public List<ShopDTO> getAllShopsDto() {
        return mappingService.getAllShopsDto();
    }

    @GetMapping(value = "/getShopById/{id}")
    public Shop getShopById(@PathVariable Long id) {
        return shopService.getShopById(id);
    }

    @PostMapping(value = "/addShop")
    public Shop createShop(HttpServletRequest request) throws IOException {
        return shopService.createShop(null);
    }

}
