package com.workshop.shoppingcartservice.controller;

import com.workshop.shoppingcartservice.common.ResponseTemplate;
import com.workshop.shoppingcartservice.entity.ShoppingCart;
import com.workshop.shoppingcartservice.service.ShoppingCartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carts")
@Slf4j
public class ShoppingCartController {

    @Autowired
    private ShoppingCartService shoppingCartService;

    @PostMapping("/")
    public ShoppingCart saverShoppingCart(@RequestBody ShoppingCart shoppingCart){

        return shoppingCartService.saveShoppingCart(shoppingCart);
    }

    @GetMapping("/{id}")
    public ResponseTemplate addProductCart(@PathVariable("id") Long shoppingCartId){

        return shoppingCartService.addProductCart(shoppingCartId);
    }

}
