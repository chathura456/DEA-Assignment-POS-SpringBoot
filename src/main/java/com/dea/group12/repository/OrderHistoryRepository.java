package com.dea.group12.repository;

import com.dea.group12.model.OrderHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderHistoryRepository extends JpaRepository<OrderHistory, Integer> {
    // You can add custom query methods if needed
}

