package com.example.springdemo.rest.model;

import jakarta.persistence.*;


@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String name;
    private int price;

    public Product() {}
    public Product(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public static Product of(String id, String name, int price) {
        var p = new Product();
        p.id = id;
        p.name = name;
        p.price = price;
        return p;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
