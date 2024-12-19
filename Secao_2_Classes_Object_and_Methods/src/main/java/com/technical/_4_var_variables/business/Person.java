package com.technical._4_var_variables.business;

public class Person {

    /*Uma vez que estamos inicializando e atribuindo uma variável, podemos omitir o tipo da variável utilizando *var*    */

    public static void showVarInUse(){
        var name = "m.a.s";
        int i = 21;
        String marcos = "marcos";
        System.out.println(name);
    }

    public static void main(String[] args) {
        showVarInUse();
    }
}
