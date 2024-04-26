package com.dea.group12.service;

import com.dea.group12.model.Orders;

import java.util.List;

public interface OrdersService {
    //user register

    Orders save(Orders orders);

    //view all users
    List<Orders> findAllOrders();

    //user update
    Orders updateOrder(Orders orders);

    //delete user
    void deleteOrder(int oid);

  //user login
//    User findByEmail(String email);
}
