package com.technical.object_orientation;

import com.technical.object_orientation.model.Dog;
import com.technical.object_orientation.model.Person;

import java.time.LocalDate;


/*This package contains a simple reminder of the object-oriented approach of java
 * There is no further explanation here, just some classes interacting with each other.*/
public class Main {
    public static void main(String[] args) {

        Person mathew = new Person("Mathew", "Ellward", LocalDate.of(1984, 6, 15));

        Person lia = new Person("Lia", "Simpson", LocalDate.of(2000, 3, 1));

        mathew.setSpouse(lia);

        Dog bob = new Dog("Bob", LocalDate.of(2024, 1, 1));

        bob.bark();
        mathew.setPet(bob);

        System.out.println(mathew);

    }

}