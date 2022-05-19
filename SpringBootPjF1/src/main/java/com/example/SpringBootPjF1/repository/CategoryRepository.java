package com.example.SpringBootPjF1.repository;

import com.example.SpringBootPjF1.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
