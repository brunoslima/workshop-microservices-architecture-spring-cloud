package com.workshop.shoppingcartservice.common;

import com.workshop.shoppingcartservice.entity.ShoppingCart;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplate {

    private ShoppingCart shoppingCart;
    private Product product;

    public void setProduct(Product product) {
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
    }
}
