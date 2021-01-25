package com.solomka.controller;

import com.solomka.model.Laptop;
import com.solomka.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class LaptopController {
    private final LaptopService laptopService;

    @Autowired
    public LaptopController(LaptopService laptopService) {
        this.laptopService = laptopService;
    }

    @GetMapping("/laptop")
    public String findAllLaptops(Model model){
        List<Laptop> laptops = laptopService.getAll();
        model.addAttribute("laptops", laptops);
        return "laptop-list";
    }
    @GetMapping("/laptop-sort")
    public String sortLaptopsDesc(Model model){
        List<Laptop> laptops = laptopService.getLaptopsSortedByBrand();
        model.addAttribute("laptops", laptops);
        return "laptop-list";
    }

    @GetMapping("/laptop-memory")
    public String getLaptopsByMemory(Model model){
        List<Laptop> laptops = laptopService.getLaptopsBySizeMemory(16);
        model.addAttribute("laptops", laptops);
        return "laptop-list";
    }

    @GetMapping("/laptop-used")
    public String getUsedLaptops(Model model){
        List<Laptop> laptops = laptopService.getUsedLaptops();
        model.addAttribute("laptops", laptops);
        return "laptop-list";
    }

    @GetMapping("/laptop-add")
    public String addLaptopForm(Laptop laptop){
        return "laptop-add";
    }

    @PostMapping("/laptop-add")
    public String addLaptop(Laptop laptop){
        laptopService.saveLaptop(laptop);
        return "redirect:/laptop";
    }
}
