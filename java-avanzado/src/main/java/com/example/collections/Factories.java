package com.example.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Factories {

    public static void main(String[] args) {

        // list
        List<Integer> numbersList = List.of(1, 2, 3, 4, 5);
        System.out.println(numbersList);

        // set
        Set<Integer> numbersSet = Set.of(1, 2, 3, 4, 5);
        System.out.println(numbersSet);

        // map
        Map<String, Integer> employees = Map.of("Mike", 35, "Juan", 28);
        System.out.println(employees);

        Map<String, Integer> employees2 = Map.ofEntries(
                Map.entry("Mike", 35),
                Map.entry("Juan", 28));

        System.out.println(employees2);
    }
}
