package com.urvashi.productserviceAPI.demo.DTO;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductDTO {

    private String title;
    private Double Price;
    private String description;

    private String image;
    private String category;
}
