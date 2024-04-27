//ProductService
package com.dea.group12.service;

import com.dea.group12.model.Products;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductsService {
    //Products Save
    Products save(Products products);

    //View All Products
    List<Products> findAllProducts();

    //Products Update
    Products updateProducts(Products products);

    //Products Delete
    void deleteProducts(int id);

}
