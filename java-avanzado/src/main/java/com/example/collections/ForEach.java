package com.example.collections;

import java.util.HashMap;
import java.util.Map;

public class ForEach {
    public static void main(String[] args) {

        Map<String, Integer> employees = new HashMap<>();
        employees.put("Antonio García", 28);
        employees.put("Patricia Pérez", 25);
        employees.put("Laura Rapali", 29);
        employees.put("Dante Alighieri", 56);

        for(Map.Entry<String, Integer> entry: employees.entrySet()) {
            String name = entry.getKey();
            Integer age = entry.getValue();
            System.out.println(name + " is " + age + " years old");
        }

        // forEach
        employees.forEach((name, age) -> System.out.println(name + " is " + age + " years old"));
        System.out.println("===========");

        // ordenar por clave
        // siempre que el orden importe se utiliza forEachOrdered en lugar de forEach
        employees.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEachOrdered(System.out::println);
    }
}
