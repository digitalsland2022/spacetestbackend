package com.shopping.cart.shoppingcart.repositories;

import com.shopping.cart.shoppingcart.model.Clients;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Clients, Integer> {
}
