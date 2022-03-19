package com.example.lambdas.interfacesfuncionales.consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Main5 {

    public static void main(String[] args) {

        BiConsumer<String, String> fullName = (firstName, lastName) ->
                System.out.println(firstName + " " + lastName);

        fullName.accept("Patricia", "Martín");

        Map<Integer, String> frameworks = new HashMap<>();
        frameworks.put(1, "Mockito");
        frameworks.put(2, "JUnit");
        frameworks.put(3, "Hibernate");
        frameworks.put(4, "Spring");

        // enfoque tradicional: imperativo
        for (Map.Entry<Integer, String> entry : frameworks.entrySet()) {
            Integer k = entry.getKey();
            String v = entry.getValue();
            System.out.println("ID: " + k + ", Name: " + v);
        }

        // enfoque moderno: declarativo
        frameworks.forEach((k, v) -> System.out.println("ID: " + k + ", Name: " + v));



    }
}
