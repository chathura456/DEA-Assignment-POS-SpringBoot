package com.dea.group12.service;

import com.dea.group12.model.OrderHistory;
import org.apache.catalina.User;

import java.util.List;

public interface OrderHistoryService {

    OrderHistory save(OrderHistory  orderHistory);

    List<OrderHistory> getAllOrderHistory();

    OrderHistory updateOrderHistory(int id, OrderHistory orderHistory);

    void deleteOrderHistory(int id);
}
