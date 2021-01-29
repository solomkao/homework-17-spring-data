package com.solomka.service;

import com.solomka.model.Laptop;

import java.util.List;

public interface LaptopService {

    Laptop getLaptopById(int id);

    List<Laptop> getAll();

    Laptop saveLaptop(Laptop laptop);

    List<Laptop> getLaptopsSortedByBrand();

    List<Laptop> getLaptopsBySizeMemory(Integer value);

    List<Laptop> getUsedLaptops();
}
