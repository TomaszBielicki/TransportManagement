package com.example.demo.service.orders;

import com.example.demo.model.Orders;
import com.example.demo.repo.OrdersRepository;
import com.example.demo.service.orders.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {

    private final OrdersRepository ordersRepository;

    @Autowired
    public OrdersServiceImpl(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    @Override
    public List<Orders> getOrders() {
        return ordersRepository.findAll();
    }
}
