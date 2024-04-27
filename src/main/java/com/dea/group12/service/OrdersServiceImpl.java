package com.dea.group12.service;

import com.dea.group12.model.Orders;
import com.dea.group12.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService{

    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    public Orders save(Orders orders) {
        return ordersRepository.save(orders);
    }

    @Override
    public List<Orders> findAllOrders() {
        return ordersRepository.findAll();
    }

    @Override
    public Orders updateOrder(Orders orders) {
        return ordersRepository.save(orders);
    }

    @Override
    public void deleteOrder(int oid) {
        ordersRepository.deleteById(oid);
    }
}
