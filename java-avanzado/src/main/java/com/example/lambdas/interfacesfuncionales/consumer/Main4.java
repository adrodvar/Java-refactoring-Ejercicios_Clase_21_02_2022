package com.example.lambdas.interfacesfuncionales.consumer;

import com.example.domain.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main4 {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Patricia", "Martín"));
        persons.add(new Person("Antonio", "García"));

        Consumer<Person> personConsumer = person ->
                System.out.println(person.getFirstName() + " " + person.getLastName());

        forEach(persons, personConsumer);
    }

    public static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T item : list){
            consumer.accept(item);
        }
    }
}
