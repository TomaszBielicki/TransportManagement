package com.example.demo.service.furniture;

import com.example.demo.model.Furniture;
import com.example.demo.repo.FurnitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FurnitureServiceImpl implements FurnitureService {

    private final FurnitureRepository furnitureRepository;

    @Autowired
    public FurnitureServiceImpl (FurnitureRepository furnitureRepository){
        this.furnitureRepository = furnitureRepository;
    }

    @Override
    public List<Furniture> getFurniture(){return furnitureRepository.findAll();}
}


