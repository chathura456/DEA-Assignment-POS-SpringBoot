package com.dea.group12.controller;
import com.dea.group12.model.LoginRequest;
import com.dea.group12.service.OrderService;
import com.dea.group12.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/addOrder")
    public Order addOrder(@RequestBody Order order) {
        return orderService.save(order);
    }

//    @GetMapping("/test")
//    public String testConnection() {
//        return "Connection OK!";
//    }

    @GetMapping("/allOrders") // New endpoint to get all users
    public List<Order> getAllOrders() {
        return orderService.findAllOrders();
    }

    @PutMapping("/orders/{oid}")
    public Order updateOrder(@PathVariable int oid, @RequestBody Order order) {
        order.setOid(oid);
        return orderService.updateOrder(order);
    }

    @DeleteMapping("/orders/{oid}")
    public void deleteOrder(@PathVariable int oid) {
        orderService.deleteOrder(oid);
    }

//    @PostMapping("/login")
//    public String login(@RequestBody LoginRequest loginDTO) {
//        User user = userService.findByEmail(loginDTO.getEmail());
//        if (user != null && user.getPassword().equals(loginDTO.getPassword())) {
//            return "Login successful";
//        } else {
//            return "Invalid credentials";
//        }
//    }
}
