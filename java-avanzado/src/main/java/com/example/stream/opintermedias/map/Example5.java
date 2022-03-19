package com.example.stream.opintermedias.map;

import java.util.Arrays;
import java.util.List;

/**
 * Given a list of numbers, return a list of the square of each number
 *
 * input: [1, 2, 3, 4, 5]
 * output: [1, 4, 9, 16, 25]
 */
public class Example5 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .toList();
        System.out.println(squares);

    }
}
