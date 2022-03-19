package com.example.stream.opintermedias.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Operación intermedia que convierte cada elemento en otro objeto utilizando una Función.
 *
 * Se utiliza comúnmente para extraer un atributo de un objeto de forma similar
 * a como funcionan las proyecciones de SQL en donde se recupera una columna de una tabla.
 */
public class Example1 {

    public static void main(String[] args) {

        List<String> texts = new ArrayList<>();
        texts.add("ddd2");
        texts.add("aaa2");
        texts.add("bbb1");
        texts.add("aaa1");
        texts.add("bbb3");
        texts.add("ccc");
        texts.add("bbb2");
        texts.add("ddd1");

//        texts.stream()
//                .map(String::toUpperCase)
//                .sorted((a, b) -> b.compareTo(a))
//                .forEach(System.out::println);

        texts.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }
}
