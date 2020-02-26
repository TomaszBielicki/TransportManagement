package com.example.demo.controller;

import com.example.demo.model.Transport;
import com.example.demo.service.TransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transport-api")
public class TransportController {

    private TransportService transportService;

    @Autowired
    public TransportController(TransportService transportService) {
        this.transportService = transportService;
    }

    @GetMapping
    public List<Transport> getTransports(){
        return transportService.getTransports();
    }
}
