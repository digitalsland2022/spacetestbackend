package com.shopping.cart.shoppingcart.controllers;

import com.shopping.cart.shoppingcart.model.Clients;
import com.shopping.cart.shoppingcart.model.Products;
import com.shopping.cart.shoppingcart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductsController {

    @Autowired
    ProductService productService;

    @PostMapping("/saveproduct")
    private void saveProduct(@RequestBody Products product)
    {
        productService.addProduct(product);
    }

    @GetMapping("/product")
    public Page<Products> getAllPosts(Pageable pageable) {
        return productService.getAllPosts(pageable);
    }

    @PutMapping("/product/{productId}")
    public Products updateProduct(@PathVariable int productId, @RequestBody Products productRequest) throws Exception {
        Products products = productService.updateProduct(productId, productRequest);
        return products;
    }
}
