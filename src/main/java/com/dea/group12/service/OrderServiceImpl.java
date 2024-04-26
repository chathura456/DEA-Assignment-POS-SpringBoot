package com.dea.group12.service;


import com.dea.group12.model.Order;
import com.dea.group12.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> findAllOrders() {
        return orderRepository.findAll(); // Corrected method call
    }

    @Override
    public Order save(Order order) {
        return orderRepository.save(order); // Corrected method call
    }

    @Override
    public Order updateOrder(Order order) {
        return orderRepository.save(order); // Corrected method call
    }

    @Override
    public void deleteOrder(int oid) {
        orderRepository.deleteById(oid); // Corrected method call
    }
}