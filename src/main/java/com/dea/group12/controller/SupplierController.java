//SupplierController

package com.dea.group12.controller;
import com.dea.group12.model.LoginRequest;
import com.dea.group12.model.Supplier;
import com.dea.group12.service.SupplierService;
import com.dea.group12.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SupplierController {
    @Autowired
    private SupplierService supplierService;

    @PostMapping("/AddSupplier")
    public Supplier addSupplier(@RequestBody Supplier supplier) {
        return supplierService.save(supplier);
    }

    @GetMapping("/allsupplier")
    public List<Supplier> getAllSuppliers() {
        return supplierService.findAllSuppliers();
    }

    @PutMapping("/suppliers/{id}")
    public Supplier updateSupplier(@PathVariable int id, @RequestBody Supplier supplier) {
        supplier.setId(id);
        return supplierService.updateSupplier(supplier);
    }

    @DeleteMapping("/suppliers/{id}")
    public void deleteSupplier(@PathVariable int id) {
        supplierService.deleteSupplier(id);
    }


}
