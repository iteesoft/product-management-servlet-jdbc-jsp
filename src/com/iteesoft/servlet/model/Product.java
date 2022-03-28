package com.iteesoft.servlet.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * User.java
 * This is a model class represents a User entity
 * @author iteesoft
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    protected int id;
    protected String name;
    protected String description;
    protected int quantity;
    protected double price;


    public Product(String name, String description, int quantity) {
        super();
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }
}
