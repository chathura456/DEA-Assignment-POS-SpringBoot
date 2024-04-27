package com.dea.group12.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "discount")
public class Discount {
    @Id
    private int did;
    @Column
    private String discountName;
    @Column
    private int discountAmount;
    @Column
    private int discountType;

    //Getter and setter
    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDiscountName() {
        return discountName;
    }

    public void setdiscountName(String discountName) {
        this.discountName = discountName;
    }

    public int getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    public int getDiscountType() {
        return discountType;
    }

    public void setDiscountType(int discountType) {
        this.discountType = discountType;
    }
}