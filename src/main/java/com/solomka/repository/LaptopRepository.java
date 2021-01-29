package com.solomka.repository;

import com.solomka.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LaptopRepository  extends JpaRepository<Laptop, Integer>{
    List<Laptop> findByOrderByBrandDesc();
    List<Laptop> findLaptopsByMemoryRAMGreaterThanEqual(Integer value);
    List<Laptop> findLaptopsByUsedEquals(Boolean used);
}