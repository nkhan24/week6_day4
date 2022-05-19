package com.example.SpringBootPjF1.repository;

import com.example.SpringBootPjF1.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver,Long> {
}
