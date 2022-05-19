package com.example.SpringBootPjF1.controller;

import com.example.SpringBootPjF1.model.Category;
import com.example.SpringBootPjF1.repository.CategoryRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class CategoryController {
    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }
    @GetMapping("/category")
    public ResponseEntity<List<Category>> getAllCategory(){
        List<Category> categories = categoryRepository.findAll();
        return ResponseEntity.ok().body(categories);
    }
    @PostMapping("/category")
    public ResponseEntity<Category> createCategory(@RequestBody Category category){
        Category result = categoryRepository.save(category);
        return ResponseEntity.ok().body(result);
    }

}
