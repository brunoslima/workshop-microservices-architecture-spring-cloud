package com.workshop.shoppingcartservice.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private Long productId;
    private String productName;
    private String productCategory;
    private double productValue;
}
