package com.example.SpringBootPjF1.repository;

import com.example.SpringBootPjF1.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DriverRepository extends JpaRepository<Driver,Long> {


    @Query(
            value = "SELECT * FROM DRIVER WHERE constructor = ?1", nativeQuery = true
    )
    List<Driver> findByConstructor(String team);
}