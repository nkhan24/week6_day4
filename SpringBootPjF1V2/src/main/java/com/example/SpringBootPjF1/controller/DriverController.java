package com.example.SpringBootPjF1.controller;

import com.example.SpringBootPjF1.model.Constructor;
import com.example.SpringBootPjF1.model.Driver;
import com.example.SpringBootPjF1.repository.ConstructorRepository;
import com.example.SpringBootPjF1.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DriverController {

    @Autowired
    private DriverRepository driverRepository;

    public DriverController(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    @GetMapping("/drivers")
    public ResponseEntity<List<Driver>> getAllDrivers(){
        List<Driver> drivers = driverRepository.findAll();
        return ResponseEntity.ok().body(drivers);
    }

    @PostMapping("/drivers")
    public ResponseEntity<Driver> createDriver(@RequestBody Driver driver){
        Driver result = driverRepository.save(driver);
        return ResponseEntity.ok().body(result);
    }
}
