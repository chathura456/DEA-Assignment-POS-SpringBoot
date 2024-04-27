//SupplierRepository

package com.dea.group12.repository;

import com.dea.group12.model.Supplier;
import com.dea.group12.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
//    Supplier findByEmail(String email);
}
