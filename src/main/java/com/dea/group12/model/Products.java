//Products
package com.dea.group12.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import javax.annotation.processing.Generated;

@Entity
public class Products {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String pname;
    private double pamount;
    private int quantity;
    public int getId() {
        return id;
    }

    //setters and getters
    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPamount() {
        return pamount;
    }

    public void setPamount(double pamount) {
        this.pamount = pamount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
