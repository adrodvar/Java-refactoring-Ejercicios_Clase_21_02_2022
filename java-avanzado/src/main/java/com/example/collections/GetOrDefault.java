package com.example.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Devolver un valor por defecto cuando se esté buscando un valor y no exista:
 */
public class GetOrDefault {

    public static void main(String[] args) {

        Map<String, Integer> employees = new HashMap<>();
        employees.put("Antonio García", 28);
        employees.put("Patricia Pérez", 25);
        employees.put("Laura Rapali", 29);
        employees.put("Dante Alighieri", 56);

        Integer age = employees.getOrDefault("Ricardo Rigatuso", 0);
        System.out.println(age);

        Integer age2 = employees.get("Ricardo Rigatuso");
        System.out.println(age2);
    }
}
