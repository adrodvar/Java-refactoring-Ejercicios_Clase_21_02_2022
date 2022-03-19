package com.example.lambdas.interfacesfuncionales.function;

import java.util.function.Function;

public class Main3 {

    public static void main(String[] args) {

        Function<Integer, Integer> funcion1 = num -> num * 2;
        Function<Integer, Integer> funcion2 = num -> num * num;

        System.out.println(funcion1.apply(2)); // 4

        System.out.println(funcion1.andThen(funcion2).apply(4)); // (4 * 2) = 8, 8 * 8 = 64

        System.out.println(funcion1.compose(funcion2).apply(4)); // (4 * 4) = 16, 16 * 2 = 32

    }
}
