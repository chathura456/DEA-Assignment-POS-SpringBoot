//SupplierService

package com.dea.group12.service;

import com.dea.group12.model.Supplier;
import com.dea.group12.model.User;

import java.util.List;

public interface SupplierService {
    //user register
    Supplier save(Supplier supplier);

    //view all users
    List<Supplier> findAllSuppliers();

    //user update
    Supplier updateSupplier(Supplier supplier);

    //delete user
    void deleteSupplier(int id);


}
