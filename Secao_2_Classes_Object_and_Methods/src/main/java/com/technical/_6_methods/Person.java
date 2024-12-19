package com.technical._6_methods;

/**
 * Demonstração dos modificadores de acesso em Java.
 * <p>
 * Modificadores de acesso definem a visibilidade de classes, métodos e variáveis.
 * Existem quatro tipos principais:
 * <p>
 * 1. **public**: O membro (classe, mét|odo ou variável) é acessível de qualquer lugar.
 * 2. **protected**: O membro é acessível apenas dentro do mesmo pacote e por subclasses.
 * 3. **default** (sem modificador): O membro é acessível apenas dentro do mesmo pacote.
 * 4. **private**: O membro é acessível apenas dentro da classe onde foi definido.
 * <p>
 * Exemplo prático:
 */
public class Person {

    private final String name = "Christopher";
     // **public**: Acessível de qualquer lugar.
    public void sayHello() {
        System.out.println("Hello, I am public!");
    }

    // **protected**: Acessível apenas dentro do mesmo pacote e em subclasses.
    protected void sayGoodbye() {
        System.out.println("Goodbye, I am protected!");
    }

    // **default** (sem modificador): Acessível apenas dentro do mesmo pacote.
    void sayDefault() {
        System.out.println("Hi, I am default!");
    }

    // **private**: Acessível apenas dentro desta classe.
    private void sayHi() {
        System.out.println("Hi, I am private!");
    }

    public StringBuilder greet(String name, int age) {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder
                .append("Hello, ").append(name)
                .append(" has: ").append(age)
                .append(" years of age");
    }


    public char returnFirstCharacterOfFirstName() {
        return name.charAt(0);
    }

    public static void main(String[] args) {
        Person person = new Person();

        // Chamando métodos com diferentes modificadores de acesso
        person.sayHello();   // Acessível, pois é public
        person.sayGoodbye(); // Acessível, pois estamos no mesmo pacote
        person.sayDefault(); // Acessível, pois estamos no mesmo pacote
        person.sayHi();      // Acessível, pois estamos dentro da mesma classe

        //StringBuilder value= person.greet("Aline", 22); // "Aline" é um argumento

        System.out.println(person.returnFirstCharacterOfFirstName());
        System.out.println(person.greet("Aline", 22)); // "Aline" e 22 são argumentos
    }
}
