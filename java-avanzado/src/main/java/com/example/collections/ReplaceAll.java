package com.example.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * replace each element in a list with a new one
 */
public class ReplaceAll {

    public static void main(String[] args) {

        List<String> codes = new ArrayList<>(List.of("a32", "b12", "c3", "d21"));
        codes.forEach(System.out::println);

        // Crea una nueva lista de Strings
        codes.stream()
                .map(code -> Character.toUpperCase(code.charAt(0)) + code.substring(1))
                .toList()
                .forEach(System.out::println);


        // actualiza la lista original:

        codes.replaceAll(code -> Character.toUpperCase(code.charAt(0)) + code.substring(1));
        codes.forEach(System.out::println);
    }
}
