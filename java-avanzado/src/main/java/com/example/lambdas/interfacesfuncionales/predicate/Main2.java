package com.example.lambdas.interfacesfuncionales.predicate;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Main2 {

    public static void main(String[] args) {

        // Objetos
        Predicate<Integer> oddNumbers = integer -> integer % 2 != 0;
        System.out.println(oddNumbers.test(1000)); // false
        System.out.println(oddNumbers.test(1001)); // true

        // Interfaz funcional especializada para trabajar con primitivos
        IntPredicate evenNumbers = integer -> integer % 2 == 0;
        System.out.println(evenNumbers.test(1000)); // true
        System.out.println(evenNumbers.test(1001)); // false
    }
}
