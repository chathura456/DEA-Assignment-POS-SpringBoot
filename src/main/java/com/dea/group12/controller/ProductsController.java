//ProductsController
package com.dea.group12.controller;

import com.dea.group12.model.Products;
import com.dea.group12.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products") //Calling the API
public class ProductsController {
    @Autowired
    private ProductsService productsService;

    @PostMapping("/AddProducts")
    public Products addProducts(@RequestBody Products products){
        return productsService.save(products);
    }
    @GetMapping("/allProducts")
    public List<Products> getAllProducts() {
        return productsService.findAllProducts();
    }
    @PutMapping("/products/{id}")
    public Products updateProducts(@PathVariable int id, @RequestBody Products products) {
        products.setId(id);
        return productsService.updateProducts(products);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProducts(@PathVariable int id) {
        productsService.deleteProducts(id);
    }

}
