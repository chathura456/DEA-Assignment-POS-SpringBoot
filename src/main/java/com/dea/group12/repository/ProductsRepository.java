//ProductsRepository
package com.dea.group12.repository;

import com.dea.group12.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Integer> {
}
