package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Error2 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = numbers
                .stream()
                .map(n -> n / 0)
                .filter(n -> n % 2 == 0);

        List<Integer> results = stream.toList();
        System.out.println(results);

        // comprobar Exception in thread "main" java.lang.ArithmeticException: / by zero

    }
}
