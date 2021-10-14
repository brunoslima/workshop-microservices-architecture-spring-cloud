package com.workshop.shoppingcartservice.repository;

import com.workshop.shoppingcartservice.entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart,Long> {

    ShoppingCart findByShoppingCartId(Long shoppingCartId);
}
