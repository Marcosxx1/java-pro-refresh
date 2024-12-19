package com.technical._11_the_object_superclass.specific.animals;

import com.technical._11_the_object_superclass.model.Pet;

import java.time.LocalDate;

/*Para todas as classes em Java, caso uma classe não esteja herdando de outra explicitamente
* Todas herdam de Object*/
public class Cat extends Pet {

    // Construtor que invoca o construtor da classe pai (superclasse) Pet.
    public Cat(String name, LocalDate dateOfBirth) {
        super(name, dateOfBirth); // Chama o construtor da classe Pet.
    }

    // Método privado que representa o comportamento específico do gato.
    private void meow() {
        System.out.println("Meow Meow");
    }

    /**
     * Sobrescrita (Override) do método `toString()` da classe Object.
     * - O método `toString` é herdado da classe Object, que é a superclasse de todas as classes em Java.
     * - Aqui, estamos redefinindo como a representação em String do objeto `Cat` será exibida.
     */
    @Override
    public String toString() {
        return "name=" + getName() + "\n" +
                "dateOfBirth=" + getDateOfBirth();
    }

    /**
     * Método principal para demonstrar a criação de um objeto `Cat` e a utilização de seus métodos.
     */
    public static void main(String[] args) {
        // Criação de um objeto Cat com um nome e uma data de nascimento.
        Cat cat = new Cat("Bob", LocalDate.of(2024, 1, 1));

        // O método `toString()` é chamado implicitamente ao usar o objeto dentro de `System.out.println`.
        System.out.println(cat);
    }
}
