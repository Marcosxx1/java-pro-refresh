package com.technical._11_the_object_superclass.specific.animals;

import com.technical._11_the_object_superclass.model.Pet;

import java.time.LocalDate;

public class Dog extends Pet {


    public Dog() {
    }

    public Dog(String name, LocalDate dateOfBirth) {
        super(name, dateOfBirth);
    }

    public void bark() {
        System.out.println("Woof Woof");
    }

}
