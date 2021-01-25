package com.solomka.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

//@Embeddable
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class Processor {
    @Column(name = "processorBrand")
    private String processorBrand;

    @Column(name = "processorModel")
    private String processorModel;

    @Column(name = "processorCores")
    private int cores;

    @Override
    public String toString() {
        return processorBrand +" "+ processorModel +" "+ cores+" cores";
    }
}
