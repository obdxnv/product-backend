package com.ulmo.backend.dto;

import jakarta.validation.constraints.*;

public class ProductDTO {

    @NotBlank(message = "Name bo'sh bo'lmasin")
    private String name;

    @NotNull(message = "Price bo'sh bo'lmasin")
    @Positive(message = "Price musbat bo'lishi kerak")
    private Double price;

    private String description;

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