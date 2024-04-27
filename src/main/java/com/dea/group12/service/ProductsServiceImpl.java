//ProductsServiceImpl
package com.dea.group12.service;

import com.dea.group12.model.Products;
import com.dea.group12.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService{
    @Autowired
    private ProductsRepository productsRepository;


    @Override
    public List<Products> findAllProducts() {
        return productsRepository.findAll();
    }

    @Override
    public Products save(Products products) {
        return productsRepository.save(products);
    }

    @Override
    public Products updateProducts(Products products) {
        return productsRepository.save(products);
    }

    @Override
    public void deleteProducts(int pid) {
        productsRepository.deleteById(pid);
    }

}
