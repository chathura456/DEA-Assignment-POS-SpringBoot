package com.dea.group12.service;

import com.dea.group12.model.Discount;
import com.dea.group12.repository.DiscountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountServiceImpl implements DiscountService{
    @Autowired
    private DiscountRepository discountRepository;

    @Override
    public List<Discount> findAllDiscount() { // Implement the method
        return discountRepository.findAll();
    }

    @Override
    public Discount save(Discount discount) {
        return discountRepository.save(discount);
    }

    @Override
    public Discount updateDiscount(Discount discount) {
        return discountRepository.save(discount);
    }

    @Override
    public void deleteDiscount(int did) {
        discountRepository.deleteById(did);
    }

}
