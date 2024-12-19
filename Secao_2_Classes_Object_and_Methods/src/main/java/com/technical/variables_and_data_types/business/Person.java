package com.technical.variables_and_data_types.business;

import com.technical.variables_and_data_types.NewsAgency;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* Em Java, usamos variáveis para armazenar valores ou referências.

 * Uma variável pode conter diferentes tipos de valores, como números, texto ou mesmo um objeto de uma classe.
 * Em Java, as variáveis precisam ter:
 *  1. **Um nome descritivo**: Que explique o que a variável representa.
 *  2. **Um tipo de dado**: Que define que tipo de valor a variável pode armazenar.
 *
 * Exemplo:
 * int age = 25; <- Uma variável chamada 'age' que armazena o valor numérico 25.
 *
 * Importante: Java é uma linguagem **estaticamente tipada**, ou seja:
 * Ao declarar uma variável, você deve informar o tipo do dado que ela irá armazenar.
 *
 * --- Objetos e Classes ---
 *
 * Uma **classe** em Java é um modelo (molde) para criar **objetos**. Um objeto é uma instância de uma classe.
 *
 * Exemplo:
 * Company company = new Company();
 * Aqui estamos criando um novo objeto do tipo "Company" e atribuindo à variável "company".
 *
 * - `Company` é o nome da classe.
 * - `company` é a variável (referência) que aponta para o objeto criado.
 *
 * Se criarmos outro objeto:
 * Company company2 = new Company();
 * Teremos dois objetos independentes na memória, mas ambos com base no mesmo molde (a classe `Company`).
 *
 * Referência:
 * private Company company;
 * -> Aqui declaramos que a variável `company` será usada para armazenar a referência de um objeto do tipo `Company`.
 */

public class Person {

    // Tipos de dados primitivos
    private byte myByte = 100;
    private short myShort = 32000;
    private int age = 25;
    private long id = 123456789L;
    private float height = 1.75f;
    private double weight = 70.5;
    private char middleInitial = 'A';
    private boolean isEmployed = true;
    private int[] scores = {85, 90, 95};

    // Objetos (Classes)
    private String firstName = "John";
    private String lastName = "Doe";
    private static Company company = new Company(); // Aqui criamos uma instância de Company
    private NewsAgency newsAgency;

    // Classes da Biblioteca Java
    private BigInteger largeNumber = new BigInteger("12345678901234567890");
    private BigDecimal salary = new BigDecimal("12345.67");

    private LocalDate birthDate = LocalDate.of(1995, 5, 15);
    private LocalTime loginTime = LocalTime.of(9, 30);
    private LocalDateTime lastLogin = LocalDateTime.now();

    // Estruturas de dados
    private List<String> hobbies = List.of("Reading", "Traveling", "Gaming");
    private Set<String> skills = Set.of("Java", "Spring", "SQL");
    private Map<String, String> preferences = Map.of("theme", "dark", "language", "English");

    public static void main(String[] args) {
        System.out.println(company);
    }

}
