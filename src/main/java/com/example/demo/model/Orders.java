package com.example.demo.model;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Orders {

    @Id
    @GeneratedValue
    private Long id;
    private String orderId;
    private String name;
    private String lastName;
    private String postCode;
    private String address;
    private Date orderDate;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orders")
    private List<Furniture> furnitureList = new ArrayList<>();

    @ManyToOne
    private Transport transport;

    public Orders() {
    }

    public Orders(String orderId, String name, String lastName, String postCode, String address, Date orderDate) {
        this.orderId = orderId;
        this.name = name;
        this.lastName = lastName;
        this.postCode = postCode;
        this.address = address;
        this.orderDate = orderDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    public List<Furniture> getFurnitureList() {
//        return furnitureList;
//    }
//
//    public void setFurnitureList(List<Furniture> furnitureList) {
//        this.furnitureList = furnitureList;
//    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
