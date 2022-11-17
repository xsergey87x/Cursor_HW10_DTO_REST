package com.cursor.hw10.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShopDTO {

    private Long id;
    private String nameShop;
    private String street;
    private String city;
    private boolean isSiteExist;

}
