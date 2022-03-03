package com.shopping.cart.shoppingcart.service;

import com.shopping.cart.shoppingcart.model.Clients;
import com.shopping.cart.shoppingcart.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Clients> getAllClients(){
        List<Clients> clientsList = new ArrayList<>();
        clientRepository.findAll().forEach(clientsList::add);
        return clientsList;
    }

    public void addClient(Clients client){
        clientRepository.save(client);
    }
}
