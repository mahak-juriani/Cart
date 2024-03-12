package com.example.Cart.models;

// import org.springframework.web.bind.annotation.GetMapping;

import lombok.Getter;
import lombok.Setter;

// import java.util.List;

@Getter
@Setter
public class Cart {
    public Long userId;
    public Long id;
    public Product product;
    public Long quantity;

    // public Cart(){}

    public Cart(Long userId,Long id, Product product, Long quantity){
        this.id = id;
        this.product = product;
        this.quantity = quantity;
    }


}
