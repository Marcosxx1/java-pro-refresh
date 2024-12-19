package com.technical._8_static_methods;


public class Person {

    /*Métodos devem ser contidos dentro de uma classe.
Por padrão, os métodos básicos não existiram até que
criemos uma instância de uma classe.
Uma classe é apenas um molde para criarmos um objeto

Na maioria dos casos. Devemos criar uma instancias para termos métodos para podermos chamar

Pessoa pessoa = new Pessoa();
pessoa.salvarDados();

Mas também podemos usar métodos sem instanciar classes
os métodos estáticos

por exemplo
public static int returnSum(int a, int b){
return a+ b;
}

psvm (String[] args){
	int sum = returnSum(1,2);
	sout(sum)
}

Em java podemos ter uma classe que não reflete o mundo real com apenas métodos estáticos, uma classe utilitária*/

    public static StringBuilder juntarPalavras(String... palavras) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < palavras.length; i++) {
            if (i == palavras.length - 1) {
                resultado.append(palavras[i]).append(".");
            } else {
                resultado.append(palavras[i]).append(", ");
            }
        }
        return resultado;
    }

    public static void juntaNumeros(int num1, int num2, String... value) {
        System.out.println("sem implementação");
    }

    public static void main(String[] args) {

        String[] arrayOfWords = {"First", "Second", "Third"};

        System.out.println(juntarPalavras(arrayOfWords));

        juntaNumeros(1, 2, "texto", "texto");
    }

}
