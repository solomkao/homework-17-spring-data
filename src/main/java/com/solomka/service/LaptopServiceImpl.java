package com.solomka.service;

import com.solomka.model.Laptop;
import com.solomka.repository.LaptopRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;


@Service
public class LaptopServiceImpl implements LaptopService {
    private final LaptopRepository repository;

    @Autowired
    public LaptopServiceImpl(LaptopRepository repository) {
        this.repository = repository;
    }

    @Override
    public Laptop getLaptopById(int id) {
        return repository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<Laptop> getAll() {
        return repository.findAll();
    }

    @Override
    public Laptop saveLaptop(Laptop laptop) {
        return repository.save(laptop);
    }

    @Override
    public List<Laptop> getLaptopsSortedByBrand() {
        return repository.findByOrderByBrandDesc();
    }

    @Override
    public List<Laptop> getLaptopsBySizeMemory(Integer value) {
        return repository.findLaptopsByMemoryRAMGreaterThanEqual(value);
    }

    @Override
    public List<Laptop> getUsedLaptops() {
        return repository.findLaptopsByUsedEquals(true);
    }


}
