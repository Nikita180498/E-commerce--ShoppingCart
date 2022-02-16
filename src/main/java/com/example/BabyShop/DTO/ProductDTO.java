package com.example.BabyShop.DTO;

import lombok.Data;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private Integer categoryId;
    public Double price;
    private String size;
    private String color;
    private String Description;
    private  String imageName;
}
