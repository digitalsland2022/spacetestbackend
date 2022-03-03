package com.shopping.cart.shoppingcart.controllers;

import com.shopping.cart.shoppingcart.model.Clients;
import com.shopping.cart.shoppingcart.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    ClientService clientService;

    @PostMapping("/saveclient")
    private void saveClient(@RequestBody Clients client)
    {
        clientService.addClient(client);
    }

    @GetMapping("/getclients")
    private List<Clients> getClients(){
        List<Clients> allClients = clientService.getAllClients();
        return allClients;
    }
}
