package com.shopping.cart.shoppingcart.repositories;

import com.shopping.cart.shoppingcart.model.Sale;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface SaleRepository extends CrudRepository<Sale, Integer> {

    @Query("from Sale s where s.date = :date")
    List<Sale> findAllWithDate(
            @Param("date") Date date);

}
