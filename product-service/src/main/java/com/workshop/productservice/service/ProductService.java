package com.workshop.productservice.service;

import com.workshop.productservice.entity.Product;
import com.workshop.productservice.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public Product findProductById(Long productId) {

        return productRepository.findByProductId(productId);
    }
}
