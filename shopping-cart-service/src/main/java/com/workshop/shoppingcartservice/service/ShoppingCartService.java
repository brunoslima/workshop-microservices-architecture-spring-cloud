package com.workshop.shoppingcartservice.service;

import com.workshop.shoppingcartservice.common.Product;
import com.workshop.shoppingcartservice.common.ResponseTemplate;
import com.workshop.shoppingcartservice.entity.ShoppingCart;
import com.workshop.shoppingcartservice.repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ShoppingCartService {

    @Autowired
    private ShoppingCartRepository shoppingCartRepository;
    @Autowired
    private RestTemplate restTemplate;

    public ShoppingCart saveShoppingCart(ShoppingCart shoppingCart) {
        return shoppingCartRepository.save(shoppingCart);
    }

    public ResponseTemplate addProductCart(Long shoppingCartId) {
        ResponseTemplate response = new ResponseTemplate();
        ShoppingCart shoppingCart = shoppingCartRepository.findByShoppingCartId(shoppingCartId);

        Product product = restTemplate.getForObject("http:localhost:9001/products/"
                                               + shoppingCart.getProductId(),Product.class);

        response.setProduct(product);
        response.setShoppingCart(shoppingCart);
        return(response);
    }
}
