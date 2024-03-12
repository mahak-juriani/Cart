package com.example.Cart.dto;
import com.example.Cart.models.Product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreCartDTO {
    private Long userId;
    private Long id;
    private Product product;
    private int quantity;

    // public FakeStoreCartDTO(){}

    public FakeStoreCartDTO(Long userId, Long id, Product product, int quantity){
        this.userId = userId;
        this.id = id;
        this.product = product;
        this.quantity = quantity;
    }
}
