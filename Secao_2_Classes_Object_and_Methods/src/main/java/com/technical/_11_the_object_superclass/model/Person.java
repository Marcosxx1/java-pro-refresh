package com.technical._11_the_object_superclass.model;

import java.time.LocalDate;

public class Person {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private Address address;
    private Person spouse;
    private Pet pet;

    public Person() {
    }

    public Person(String name, String surname, LocalDate dateOfBirth, Address address, Person spouse, Pet pet) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.spouse = spouse;
        this.pet = pet;
    }

    public Person(String name, String surname, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person getSpouse() {
        return spouse;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address=" + address +
                ", spouse=" + spouse +
                ", pet=" + pet +
                '}';
    }
}
