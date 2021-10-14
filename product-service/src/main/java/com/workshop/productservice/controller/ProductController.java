package com.workshop.productservice.controller;

import com.workshop.productservice.entity.Product;
import com.workshop.productservice.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
@Slf4j
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/")
    public Product saveProduct(@RequestBody  Product product){
        return productService.saveProduct(product);
    }

    @GetMapping("/{id}")
    public Product findProductById(@PathVariable("id") Long productId){
        return productService.findProductById(productId);
    }
}
