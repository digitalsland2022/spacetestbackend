package com.shopping.cart.shoppingcart.service;

import com.shopping.cart.shoppingcart.model.Products;
import com.shopping.cart.shoppingcart.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductsRepository productRepository;

    public Products updateProduct(int productId, Products product) throws Exception {
        return productRepository.findById(productId).map(productObj -> {
            productObj.setNumber(product.getNumber());
            productObj.setPrice(product.getPrice());
            return productRepository.save(product);
        }).orElseThrow(() -> new Exception("ProductId " + productId + " not found"));
    }

    public Page<Products> getAllPosts(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    public void addProduct(Products product){
        productRepository.save(product);
    }
}
