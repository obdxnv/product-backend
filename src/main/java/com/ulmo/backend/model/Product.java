package com.ulmo.backend.model;

import jakarta.persistence.*;  // ⬅ MUHIM: jakarta.persistence import qiling!

@Entity  // ⬅ BU ANOTATSIYA KERAK!
@Table(name = "products")
public class Product {

    @Id  // ⬅️ BU HAM KERAK!
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private Double price;

    @Column(length = 500)
    private String description;

    // Bo'sh constructor (JPA uchun MAJBURIY!)
    public Product() {
    }

    // Getter va Setterlar
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}