package com.example.lambdas.interfacesfuncionales.consumer;

import com.example.domain.Person;

import java.util.function.Consumer;

public class Main1 {

    public static void main(String[] args) {

        Consumer<String> consumer1 = mensaje -> System.out.println(mensaje);

        consumer1.accept("mensaje1");
        consumer1.accept("mensaje2");
        consumer1.accept("mensaje3");

        Consumer<Person> consumer2 = person ->
                System.out.println(person.getFirstName().concat(" ").concat(person.getLastName()));

        consumer2.accept(new Person("Antonio", "García"));
    }
}
