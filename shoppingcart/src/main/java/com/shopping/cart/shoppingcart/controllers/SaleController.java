package com.shopping.cart.shoppingcart.controllers;

import com.shopping.cart.shoppingcart.model.Clients;
import com.shopping.cart.shoppingcart.model.Sale;
import com.shopping.cart.shoppingcart.service.ClientService;
import com.shopping.cart.shoppingcart.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaleController {

    @Autowired
    SaleService saleService;

    @PostMapping("/savesale")
    private void saveSale(@RequestBody Sale sale)
    {
        saleService.addSale(sale);
    }
}
