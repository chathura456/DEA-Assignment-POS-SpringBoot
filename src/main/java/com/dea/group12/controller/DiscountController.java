package com.dea.group12.controller;

import com.dea.group12.service.DiscountService;
import com.dea.group12.model.Discount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/discount")
@CrossOrigin(origins = "http://localhost:5173") //enable cors for frontend
public class DiscountController {
    @Autowired
    private DiscountService discountService;

    @PostMapping("/addDiscount")
    public Discount addDiscount(@RequestBody Discount discount) {
        return discountService.save(discount);
    }

    @GetMapping("/allDiscount") // New endpoint to get all users
    public List<Discount> getAllDiscount() {
        return discountService.findAllDiscount();
    }

    @PutMapping("/discount/{did}")
    public Discount updateDiscount(@PathVariable int did, @RequestBody Discount discount) {
        discount.setDid(did);
        return discountService.updateDiscount(discount);
    }

    @DeleteMapping("/discount/{did}")
    public void deleteUser(@PathVariable int did) {
        discountService.deleteDiscount(did);
    }

}