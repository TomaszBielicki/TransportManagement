package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Furniture {

    @Id
    @GeneratedValue
    private Long id;
    private String furnitureId;
    private String name;
    private double capacity;

    @ManyToOne
    private Orders orders;

    public Furniture() {
    }

    public Furniture(String furnitureId, String name, double capacity) {
        this.furnitureId = furnitureId;
        this.name = name;
        this.capacity = capacity;
    }

    public String getFurnitureId() {
        return furnitureId;
    }

    public void setFurnitureId(String furnitureId) {
        this.furnitureId = furnitureId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
