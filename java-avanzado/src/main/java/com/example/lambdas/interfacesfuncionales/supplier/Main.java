package com.example.lambdas.interfacesfuncionales.supplier;

import com.example.domain.Person;

import java.util.UUID;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Supplier<String> supplier1 = () -> "hola mundo";
        String texto = supplier1.get();
        System.out.println(texto);

        Supplier<String> uuidGenerator = () -> UUID.randomUUID().toString();
        System.out.println(uuidGenerator.get());
        System.out.println(uuidGenerator.get());
        System.out.println(uuidGenerator.get());

        Supplier<Person> personGenerator = () -> new Person();
    }
}
