package com.example.SpringBootPjF1.controller;

import com.example.SpringBootPjF1.model.Category;
import com.example.SpringBootPjF1.model.Constructor;
import com.example.SpringBootPjF1.repository.CategoryRepository;
import com.example.SpringBootPjF1.repository.ConstructorRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConstructorController {
    private final ConstructorRepository constructorRepository;

    public ConstructorController(ConstructorRepository constructorRepository){
        this.constructorRepository = constructorRepository ;
    }
    @GetMapping("/constructors")
    public ResponseEntity<List<Constructor>> getAllCategory(){
        List<Constructor> constructors = constructorRepository.findAll();
        return ResponseEntity.ok().body(constructors);
    }
    @PostMapping("/constructors")
    public ResponseEntity<Constructor> createConstructor(@RequestBody Constructor constructor){
        Constructor result = constructorRepository.save(constructor);
        return ResponseEntity.ok().body(result);
    }

}