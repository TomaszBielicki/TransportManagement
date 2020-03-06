package com.example.demo.controller;

import com.example.demo.model.Orders;
import com.example.demo.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders-api")
public class OrdersController {

    private OrdersService ordersService;

    @Autowired
    public OrdersController (OrdersService ordersService){
        this.ordersService = ordersService;
    }

    @GetMapping
    public List<Orders> getOrders(){
    return ordersService.getOrders();
    }


}
