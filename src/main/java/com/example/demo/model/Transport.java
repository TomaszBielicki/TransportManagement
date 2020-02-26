package com.example.demo.model;

import java.util.Date;
import java.util.List;

public class Transport {

    private Long id;
    private String transportId;
    private List<Order> orderList;
    private double capacity;
    private Date deliveryDate;

    public Transport() {
    }

    public Transport(Long id, String transportId, List<Order> orderList, double capacity, Date deliveryDate) {
        this.id = id;
        this.transportId = transportId;
        this.orderList = orderList;
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

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

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
