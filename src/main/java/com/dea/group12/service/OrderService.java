package com.dea.group12.service;

import com.dea.group12.model.Order;

import java.util.List;

public interface OrderService {
    //user register
    Order save(Order order);

    //view all users
    List<Order> findAllOrders();

    //user update
    Order updateOrder(Order order);

    //delete user
    void deleteOrder(int oid);

  //user login
//    User findByEmail(String email);
}
