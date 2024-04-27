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
@CrossOrigin(origins = "http://localhost:5173") //enable cors for frontend
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

    @PostMapping("/add")
    public OrderHistory addHistory(@RequestBody OrderHistory orderHistory) {
        return orderHistoryService.save(orderHistory);
    }
    @PutMapping("/{id}")
    public OrderHistory updateOrderHistory(@PathVariable int id, @RequestBody OrderHistory orderHistory) {
        orderHistory.setOrderHistoryId(id);
        return orderHistoryService.updateOrderHistory(id, orderHistory);
    }
    @DeleteMapping("/{id}")
    public void deleteOrderHistory(@PathVariable int id) {
        orderHistoryService.deleteOrderHistory(id);
    }

}
