package com.example.demo.service.transport;

import com.example.demo.model.Transport;
import com.example.demo.repo.TransportRepository;
import com.example.demo.service.transport.TransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportServiceImpl implements TransportService {

    private final TransportRepository transportRepository;

    @Autowired
    public TransportServiceImpl(TransportRepository transportRepository) {
        this.transportRepository = transportRepository;
    }

    @Override
    public List<Transport> getTransports() {
        return transportRepository.findAll();
    }
}
