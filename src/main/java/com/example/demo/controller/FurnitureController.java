package com.example.demo.controller;

import com.example.demo.model.Furniture;
import com.example.demo.service.furniture.FurnitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/furniture-api")
public class FurnitureController {

    private FurnitureService furnitureService;

    @Autowired
    public FurnitureController(FurnitureService furnitureService){this.furnitureService = furnitureService;}

    @GetMapping
    public List<Furniture> getFurniture(){return furnitureService.getFurniture();}
}
