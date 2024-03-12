package com.example.Cart.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private Long id;
    private String title;
    private String description;
    private int price;
    private Category category;
    private String imageUrl;

    // public Product(){}

    public Product(Long id, String title, String description, int price, Category category, String imageUrl){
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.category = category;
        this.imageUrl = imageUrl;
    }

}
