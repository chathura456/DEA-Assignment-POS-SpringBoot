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
    @Autowired
    private OrderHistoryService orderHistoryService;

    // Endpoint to retrieve all order history entries
    @GetMapping
    public List<OrderHistory> getAllOrderHistory() {
        return orderHistoryService.getAllOrderHistory();
    }

    @PostMapping("/add")
    public OrderHistory addHistory(@RequestBody OrderHistory orderHistory) {
        return orderHistoryService.save(orderHistory);
    }
}
