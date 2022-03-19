package com.example.stream.opintermedias.map;

import java.util.Arrays;
import java.util.List;

/**
 * Given two lists of numbers, return all pairs of numbers
 *
 * input: list [1, 2, 3] and a list [3, 4]
 * output: [(1, 3), (1, 4), (2, 3), (2, 4), (3, 3), (3, 4)]
 */
public class Example6 {

    public static void main(String[] args) {

        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);

        List<int[]> pairs = numbers1.stream()
                .flatMap(i -> numbers2.stream()
                .map(j -> new int[]{i, j}))
                .toList();

        System.out.println(pairs);
        // filtrando divisibles por 3

        pairs = numbers1.stream()
                .flatMap(i -> numbers2.stream()
                .filter(j -> (i + j) % 3 == 0)
                .map(j -> new int[]{i, j}))
                .toList();

        System.out.println(pairs);

    }
}
