package com.dea.group12.service;

import com.dea.group12.model.Discount;
import java.util.List;

public interface DiscountService {

    //User Register
    Discount save(Discount discount);

    //View All users
    List<Discount> findAllDiscount();

    //User Update
    Discount updateDiscount(Discount discount);

    //Delete User
    void deleteDiscount(int did);

}
