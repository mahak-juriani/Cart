package com.example.Cart.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.Cart.dto.FakeStoreCartDTO;
import com.example.Cart.models.Cart;
// import com.example.Cart.services.CartService;
import com.example.Cart.services.CartServiceImplimentation;

// import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class CartController {
    private CartServiceImplimentation cs;

    public CartController(CartServiceImplimentation cartService){
        this.cs = cartService;
    }

    
    @GetMapping("/carts/")
    public FakeStoreCartDTO[] getAllCarts(){
        return cs.getAllCarts();
    }

    @GetMapping("/carts/{id}")
    public FakeStoreCartDTO getCartById(@PathVariable Long id){
        return cs.getCartById(id);
    }

    //
    // @GetMapping("/{startDate}/{endDate}")
    // public Cart getCartByDate(){
    //     return cs.getCartById();
    // }
    //

    @GetMapping("/carts/user-cart/{userId}")
    public FakeStoreCartDTO[] getUserCart(@PathVariable Long userId) {
        return cs.getUserCart(userId);
    }

    @PostMapping("/carts/")
    public ResponseEntity<FakeStoreCartDTO[]> addCart(@RequestBody Cart cart){
        return cs.addCart(cart);
    }
    
    @PostMapping("/carts/{id}")
    public ResponseEntity<FakeStoreCartDTO[]> updateCart(@PathVariable Long id) {
        return cs.updateCart(id);
    }

    @GetMapping("/carts/delete/{id}")
    public String deleteCart(@PathVariable Long id){
        cs.deleteCart(id);
        return "Cart deleted Successfully";
    }
    
    
}
