package com.dea.group12.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class OrderHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderHistoryId;
    private Date orderDate; // Date of the order history entry

    // Getter and setter methods for orderHistoryId
    public Integer getOrderHistoryId() {
        return orderHistoryId;
    }

    public void setOrderHistoryId(Integer orderHistoryId) {
        this.orderHistoryId = orderHistoryId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}

