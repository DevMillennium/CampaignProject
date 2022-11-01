package com.kampanya.favorite.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.math.BigInteger;

@Entity
public class Favorite {

    @Id
    @GeneratedValue
    @SequenceGenerator(name = "favorite_id_sequence",sequenceName = "favorite_id_sequence")
    private int id;

    private String name;

    private BigInteger price;

    public Favorite() {
    }

    public Favorite(int id, String name, BigInteger price) {
        this.id = id;
        this.name = name;
        this.price = price;
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
