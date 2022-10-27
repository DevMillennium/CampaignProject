package com.kampanya.product.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.math.BigInteger;

@Entity
public class Product {

    @Id
    @SequenceGenerator(name = "product_id_sequence",sequenceName = "product_id_sequence")
    @GeneratedValue
    private int id;
    private String name;
    private BigInteger price;

    public Product(int id, String name, BigInteger price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }
}
