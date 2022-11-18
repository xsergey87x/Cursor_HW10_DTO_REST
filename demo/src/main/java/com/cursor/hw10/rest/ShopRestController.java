package com.cursor.hw10.rest;


import com.cursor.hw10.dto.ShopDTO;
import com.cursor.hw10.entity.Shop;
import com.cursor.hw10.service.MappingService;
import com.cursor.hw10.service.ModelMappingService;
import com.cursor.hw10.service.ShopService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping(value = "/shop")
public class ShopRestController {

    private final ShopService shopService;
    private final ModelMappingService modelMappingService;
    private final MappingService mappingService;

    public ShopRestController(ShopService shopService, ModelMappingService modelMappingService, MappingService mappingService) {
        this.shopService = shopService;
        this.modelMappingService = modelMappingService;
        this.mappingService = mappingService;
    }

    @GetMapping(value = "/getAll")
    public void getAllShops(HttpServletResponse response) throws IOException {
        response.getWriter().write(modelMappingService.getJsonFromShop(shopService.getAllShops()));
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
        BufferedReader reader = request.getReader();
        String shopJson = reader.lines().collect(Collectors.joining());
        return shopService.createShop(modelMappingService.getShopFromJson(shopJson));
    }
}
