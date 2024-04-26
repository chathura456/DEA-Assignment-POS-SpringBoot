package com.dea.group12.controller;

import com.dea.group12.model.OrderHistory;
import com.dea.group12.model.User;
import com.dea.group12.service.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.dea.group12.model.OrderHistory;
import java.util.List;

@RestController
@RequestMapping("/order-history")
public class OrderHistoryController {
    private final OrderHistoryService orderHistoryService;
    @Autowired
    public OrderHistoryController(OrderHistoryService orderHistoryService) {
        this.orderHistoryService = orderHistoryService;
    }

    // Endpoint to retrieve all order history entries
    @GetMapping
    public List<OrderHistory> getAllOrderHistory() {
        return orderHistoryService.getAllOrderHistory();
    }
    @GetMapping("/{id}")
    public OrderHistory getOrderHistoryById(@PathVariable Long id) {
        return orderHistoryService.getOrderHistoryById(id);
    }

    @PostMapping("/add")
    public OrderHistory addHistory(@RequestBody OrderHistory orderHistory) {
        return orderHistoryService.save(orderHistory);
    }
    @PutMapping("/{id}")
    public OrderHistory updateOrderHistory(@PathVariable Long id, @RequestBody OrderHistory orderHistory) {
        return orderHistoryService.updateOrderHistory(id, orderHistory);
    }
    @DeleteMapping("/{id}")
    public void deleteOrderHistory(@PathVariable Long id) {
        orderHistoryService.deleteOrderHistory(id);
    }

}
