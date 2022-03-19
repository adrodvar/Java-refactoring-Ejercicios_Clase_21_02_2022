package com.example.lambdas.interfacesfuncionales.function;

import com.example.domain.Person;

import java.util.function.Function;

public class Main1 {

    public static void main(String[] args) {

        Function<String, Integer> lengthFunction = text -> text.length();
        Integer longitud = lengthFunction.apply("Hola mundo");
        System.out.println(longitud);

        Function<Double, Double> priceIVAFunction = price -> price + price * 0.21;
        Double priceWithIVA = priceIVAFunction.apply(100.0);
        System.out.println(priceWithIVA);

        Function<Person, String> lastnameFunction = person -> person.getLastName();
        String garcia = lastnameFunction.apply(new Person("Juan", "García"));
        System.out.println(garcia);


    }
}
