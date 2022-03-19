package com.example.lambdas.interfacesfuncionales.comparator;

import java.util.Arrays;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("zecdsfsdf", "alpa", "prueba", "e");
        System.out.println(names);

        names.sort((name1, name2) -> name1.length() - name2.length());

        System.out.println(names);

        /*
        Recomendable: las lambdas deben ser pequeñas y no tener más de una línea
        Pero en caso de necesitar más de una línea se puede poner utilizando llaves {}

         */
        names.sort((name1, name2) -> {
            System.out.println("hola desde lambda");
            String saludo = saludo();
            System.out.println(saludo);
            return name1.length() - name2.length();
        });

    }

    private static String saludo() {
        return "Hola buenas";
    }


}
