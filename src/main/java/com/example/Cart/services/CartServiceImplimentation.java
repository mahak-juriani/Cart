package com.example.Cart.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Cart.dto.FakeStoreCartDTO;
import com.example.Cart.models.Cart;

// import java.util.List;

@Service
public class CartServiceImplimentation {
    private final RestTemplate restTemplate = new RestTemplate();
    private final String url = "https://fakestoreapi.com";

    public FakeStoreCartDTO[] getAllCarts(){
        FakeStoreCartDTO response[] = restTemplate.getForObject(url+ "/carts/", FakeStoreCartDTO[].class);
        return response;
    }

    public FakeStoreCartDTO getCartById(Long id){
        var response = restTemplate.getForObject(url+ "/carts/" + id, FakeStoreCartDTO.class);
        return response;
        // return "Product from Service with id : " + id;
    }

    public FakeStoreCartDTO[] getUserCart(Long userId){
        var response = restTemplate.getForObject(url + "/carts/" + userId, FakeStoreCartDTO[].class);
        return response;
    }

    public FakeStoreCartDTO[] addCart(Cart cart){
        var response = restTemplate.postForObject(url + "/carts/", cart, FakeStoreCartDTO[].class);
        return response;
    }

    public FakeStoreCartDTO[] updateCart(Long id){
        var response = restTemplate.postForObject(url, id, FakeStoreCartDTO[].class);
        return response;
    }

    public void deleteCart(Long id) {
        restTemplate.delete(url + "/" + id);
    }

}

