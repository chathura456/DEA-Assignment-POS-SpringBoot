package com.dea.group12.service;

import com.dea.group12.model.OrderHistory;
import com.dea.group12.repository.OrderHistoryRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderHistoryServiceImpl implements OrderHistoryService {

    private final OrderHistoryRepository orderHistoryRepository;

    @Autowired
    public OrderHistoryServiceImpl(OrderHistoryRepository orderHistoryRepository) {
        super();
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
}

