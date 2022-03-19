package com.example.lambdas.interfacesfuncionales.predicate;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Predicate<String> hasLength = mensaje -> mensaje.length() > 0;

        boolean result1 = hasLength.test("Hola"); // true
        boolean result2 = hasLength.test(""); // false

        System.out.println(result1);
        System.out.println(result2);

        Predicate<String> notHasLength = hasLength.negate();
        boolean result3 = notHasLength.test("Hola"); // false
        System.out.println(result3);


    }
}
