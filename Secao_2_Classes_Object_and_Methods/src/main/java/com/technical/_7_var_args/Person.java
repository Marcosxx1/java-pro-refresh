package com.technical._7_var_args;


public class Person {

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

    public static void juntaNumeros(int num1, int num2, String... value){
        System.out.println("sem implementação");
    }

    /*    public static String juntarPalavras(String[] palavras) {
        return Arrays.stream(palavras)  // Cria um Stream a partir do array
                .collect(Collectors.joining(", ", "", "."));  // Junta as palavras com vírgula e adiciona ponto no final
    }*/

    public static void main(String[] args) {

        String[] arrayOfWords = {"First", "Second", "Third"};

        System.out.println(juntarPalavras(arrayOfWords));

        //Também podemos utilizar o varargs "Objeto..." com números
        // Mas sempre nos atentando que o varargs deve vir como último elemento
       juntaNumeros(1,2,"texto", "texto");
    }

}
