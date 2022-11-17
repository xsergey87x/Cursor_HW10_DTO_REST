package com.cursor.hw10.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AmountWorkersDto {

    private Long id;
    private String name;
    private String country;
    private String city;

}
