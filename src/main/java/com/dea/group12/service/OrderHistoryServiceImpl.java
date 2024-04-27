package com.dea.group12.service;

import com.dea.group12.model.OrderHistory;
import com.dea.group12.repository.OrderHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderHistoryServiceImpl implements OrderHistoryService {

    private final OrderHistoryRepository orderHistoryRepository;

    @Autowired
    public OrderHistoryServiceImpl(OrderHistoryRepository orderHistoryRepository) {
        this.orderHistoryRepository = orderHistoryRepository;
    }

    @Override
    public OrderHistory save(OrderHistory orderHistory) {
        return orderHistoryRepository.save(orderHistory);
    }

    @Override
    public List<OrderHistory> getAllOrderHistory() {
        return orderHistoryRepository.findAll();
    }

    @Override
    public OrderHistory updateOrderHistory(int id, OrderHistory orderHistory) {
        return orderHistoryRepository.save(orderHistory);
    }

    @Override
    public void deleteOrderHistory(int id) {
        orderHistoryRepository.deleteById(id);
    }

}
