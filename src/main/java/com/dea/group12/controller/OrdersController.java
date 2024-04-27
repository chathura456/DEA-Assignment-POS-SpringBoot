package com.dea.group12.controller;
import com.dea.group12.model.Orders;
import com.dea.group12.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@CrossOrigin(origins = "http://localhost:5173") //enable cors for frontend
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @PostMapping("/addOrder")
    public Orders addOrders(@RequestBody Orders orders) {
        return ordersService.save(orders);
    }

    @GetMapping("/allOrders")
    public List<Orders> getAllOrder() {
        return ordersService.findAllOrders();
    }

    @PutMapping("/orders/{oid}")
    public Orders updateOrders(@PathVariable int oid, @RequestBody Orders orders) {
        orders.setOid(oid);
        return ordersService.updateOrder(orders);
    }

    @DeleteMapping("/orders/{oid}")
    public void deleteOrders(@PathVariable int oid) {
        ordersService.deleteOrder(oid);
    }
}
