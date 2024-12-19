package com.technical._1_object_orientation.model;

import java.time.LocalDate;

public class Pet {
    private String name;
    private LocalDate dateOfBirth;

    public Pet() {
    }

    public Pet(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
