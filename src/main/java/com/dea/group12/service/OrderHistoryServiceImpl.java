package com.dea.group12.service;

import com.dea.group12.model.OrderHistory;
import com.dea.group12.repository.OrderHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderHistoryServiceImpl implements OrderHistoryService {

    private final OrderHistoryRepository orderHistoryRepository;

    @Autowired
    public OrderHistoryServiceImpl(OrderHistoryRepository orderHistoryRepository) {
        this.orderHistoryRepository = orderHistoryRepository;
    }

    @Override
    public OrderHistory save(OrderHistory orderHistory) {
        return orderHistory;
    }

    @Override
    public List<OrderHistory> getAllOrderHistory() {
        return orderHistoryRepository.findAll();
    }

    @Override
    public OrderHistory getOrderHistoryById(Long id) {
        return null;
    }

    @Override
    public OrderHistory getOrderHistoryById(int id) {
        Optional<OrderHistory> orderHistoryOptional = orderHistoryRepository.findById(id);
        return orderHistoryOptional.orElse(null);
    }

    @Override
    public OrderHistory createOrderHistory(OrderHistory orderHistory) {
        return orderHistoryRepository.save(orderHistory);
    }

    @Override
    public OrderHistory updateOrderHistory(Long id, OrderHistory orderHistory) {
        OrderHistory existingOrderHistory = getOrderHistoryById(id);
        if (existingOrderHistory != null) {
            orderHistory.setOrderHistoryId(existingOrderHistory.getOrderHistoryId());
            return orderHistoryRepository.save(orderHistory);
        }
        return null;
    }

    @Override
    public void deleteOrderHistory(Long id) {

    }
    
    @Override
    public void deleteOrderHistory(int id) {
        orderHistoryRepository.deleteById(id);
    }
}
