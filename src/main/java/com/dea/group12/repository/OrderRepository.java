package com.dea.group12.repository;

import com.dea.group12.model.Order;
import com.dea.group12.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    Order findByEmail(String email);

}
