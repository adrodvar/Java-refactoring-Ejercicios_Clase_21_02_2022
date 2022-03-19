package com.example.lambdas.interfacesfuncionales.consumer;

import com.example.domain.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {

        // iterar sobre String
        List<String> names = Arrays.asList("zecdsfsdf", "alpa", "prueba", "e");

        for (String name : names) {
            System.out.println(name);
        }

        names.forEach(t -> System.out.println(t));
        names.forEach(name -> System.out.println(name));

        // iterar sobre Person
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Patricia", "Martín"));
        persons.add(new Person("Antonio", "García"));

        persons.forEach(person ->
                System.out.println(person.getFirstName() + " " + person.getLastName()));
    }
}
