package com.shopping.cart.shoppingcart.service;

import com.shopping.cart.shoppingcart.model.Clients;
import com.shopping.cart.shoppingcart.model.Products;
import com.shopping.cart.shoppingcart.model.Sale;
import com.shopping.cart.shoppingcart.repositories.ProductsRepository;
import com.shopping.cart.shoppingcart.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    public void addSale(Sale sale){
        saleRepository.save(sale);
    }

    public List<Sale> getWithDate(Date date){
        List<Sale> saleList = new ArrayList<>();
        saleList = saleRepository.findAllWithDate(date);
        return saleList;
    }
}
