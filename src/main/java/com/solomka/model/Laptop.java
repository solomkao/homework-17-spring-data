package com.solomka.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Laptop implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "model", nullable = false)
    private String model;

    @Column(name = "brand", nullable = false)
    private String brand;

    @Column(name = "memory_RAM")
    private Integer memoryRAM;

    @Column(name = "used")
    private boolean used;

    @Column(name = "case_type")
    private String caseType;

    @Column(name = "price")
    private double price;

    @Column(name = "processor_brand")
    private String processorBrand;

    @Column(name = "processor_model")
    private String processorModel;

    @Column(name = "processor_cores")
    private int processorCores;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "date", nullable = false)
    private Date date;
}
