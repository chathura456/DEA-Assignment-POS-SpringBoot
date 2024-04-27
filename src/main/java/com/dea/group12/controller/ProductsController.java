//ProductsController
package com.dea.group12.controller;

import com.dea.group12.model.Products;
import com.dea.group12.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:5173")
public class ProductsController {

    @Autowired
    private ProductsService productsService;

    @PostMapping("/save")
    public Products save(@RequestBody Products products) {
        return productsService.save(products);
}

    @GetMapping("/getAllProducts")
    public List<Products> getAllProducts() {
        return productsService.getAllProducts();
    }

    @PutMapping("/update")
    public Products update(@RequestBody Products products) {
        return productsService.update(products);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Products products) {
        productsService.delete(products);
    }
}
