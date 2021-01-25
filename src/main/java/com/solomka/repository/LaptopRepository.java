package com.solomka.repository;

import com.solomka.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;


public interface LaptopRepository  extends JpaRepository<Laptop, Integer>
{
    List<Laptop> findByOrderByBrandDesc();
    //@Query("SELECT l FROM Laptop l WHERE l.memoryRAM > 16")
    List<Laptop> findLaptopsByMemoryRAMGreaterThanEqual(Integer value);

    List<Laptop> findLaptopsByUsedEquals(Boolean used);
}
