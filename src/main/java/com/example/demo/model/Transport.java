package com.example.demo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Transport {

    @Id
    @GeneratedValue
    private Long id;
    private String transportId;
    private double capacity;
    private Date deliveryDate;

    @OneToMany(mappedBy = "transport")
    private List<Orders> orderList = new ArrayList<>();

    public Transport() {
    }

    public Transport(String transportId, double capacity, Date deliveryDate) {
        this.transportId = transportId;
        this.capacity = capacity;
        this.deliveryDate = deliveryDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTransportId() {
        return transportId;
    }

    public void setTransportId(String transportId) {
        this.transportId = transportId;
    }

//    public List<Order> getOrderList() {
//        return orderList;
//    }
//
//    public void setOrderList(List<Order> orderList) {
//        this.orderList = orderList;
//    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}
