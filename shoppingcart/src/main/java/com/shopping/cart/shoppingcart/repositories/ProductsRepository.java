package com.shopping.cart.shoppingcart.repositories;

import com.shopping.cart.shoppingcart.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Integer> {
}
