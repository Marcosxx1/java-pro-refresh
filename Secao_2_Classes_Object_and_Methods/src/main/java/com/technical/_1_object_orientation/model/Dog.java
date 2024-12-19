package com.technical._1_object_orientation.model;

import java.time.LocalDate;

public class Dog extends Pet{


    public Dog() {
    }

    public Dog(String name, LocalDate dateOfBirth) {
        super(name, dateOfBirth);
    }

    public void bark() {
        System.out.println("Woof Woof");
    }

}
