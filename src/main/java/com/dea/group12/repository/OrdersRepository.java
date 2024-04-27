package com.dea.group12.repository;

import com.dea.group12.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface OrdersRepository extends JpaRepository<Orders, Integer> {

}
