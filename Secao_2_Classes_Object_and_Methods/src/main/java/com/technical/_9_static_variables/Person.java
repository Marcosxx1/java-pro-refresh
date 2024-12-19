package com.technical._9_static_variables;


public class Person {
    /*Assim como métodos estáticos que podem existir antes da existencia de suas classes
     * variáveis estáticas também seguem o mesmo padrão*/
    public static Person Aline = null;

    /*PVariáveis estáticas também pertencem à classe e não a instâncias específicas.
São compartilhadas entre todas as instâncias da classe, ou seja, todas as instâncias acessam o mesmo valor.
Usadas geralmente para constantes ou valores compartilhados, como contadores globais.*/

    /*Uma variável estática é compartilhada entre todas as instâncias da classe.
Se você alterar o valor de uma variável estática por meio de uma instância ou da própria classe, essa mudança será refletida em todas as instâncias.*/
    public static double PI = 3.14;
    public static int valorEstatico = 10; // Atributo estático


    public static void main(String[] args) {

        System.out.println(PI);
        //System.out.println(valor); // <- Aqui temos um erro pois um valor estático não pode
        //ser referenciado fora de um contexto estático, diferénte de PI

        Person obj1 = new Person();
        Person obj2 = new Person();

        obj1.valorEstatico = 20; // Alterando o valor estático usando obj1

        System.out.println(obj1.valorEstatico); // Saída: 20
        System.out.println(obj2.valorEstatico); // Saída: 20
        System.out.println(Person.valorEstatico); // Saída: 20

    }

}
