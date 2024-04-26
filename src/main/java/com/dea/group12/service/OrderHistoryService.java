package com.dea.group12.service;

import com.dea.group12.model.OrderHistory;
import org.apache.catalina.User;

import java.util.List;

public interface OrderHistoryService {

    OrderHistory save(OrderHistory  orderHistory);

    List<OrderHistory> getAllOrderHistory();
    OrderHistory getOrderHistoryById(Long id);

    OrderHistory getOrderHistoryById(int id);

    OrderHistory createOrderHistory(OrderHistory orderHistory);

    OrderHistory updateOrderHistory(Long id, OrderHistory orderHistory);

    void deleteOrderHistory(Long id);

    void deleteOrderHistory(int id);
}
