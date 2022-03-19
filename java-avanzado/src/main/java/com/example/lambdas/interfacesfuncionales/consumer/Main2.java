package com.example.lambdas.interfacesfuncionales.consumer;

import java.util.function.Consumer;

public class Main2 {

    public static void main(String[] args) {

        Consumer<String> consumer1 = mensaje -> System.out.println(mensaje);
        Consumer<String> consumer2 = mensaje -> System.out.println(mensaje);

        Consumer<String> consumer3 = consumer1.andThen(consumer2);
        consumer3.accept("Hola mundo!");
    }
}
