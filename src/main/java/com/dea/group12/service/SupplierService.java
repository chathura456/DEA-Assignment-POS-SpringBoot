//SupplierService

package com.dea.group12.service;

import com.dea.group12.model.Supplier;
import com.dea.group12.model.User;

import java.util.List;

public interface SupplierService {
    //Add supplier
    Supplier save(Supplier supplier);

    //view all suppliers
    List<Supplier> findAllSuppliers();

    //supplier update
    Supplier updateSupplier(Supplier supplier);

    //delete supplier
    void deleteSupplier(int id);


}
