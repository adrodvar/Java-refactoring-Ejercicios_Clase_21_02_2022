package com.example.stream.opterminales.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * reduce toma 2 argumentos:
 * valor inicial
 * BinaryOperator<T> para combinar dos elementos y crear uno nuevo
 */
public class Example1 {

    public static void main(String[] args) {

        //sumatorio

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = 0;

        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);

        // con stream:
//        int sum2 = numbers.stream()
//                .reduce(0, (a, b) -> a + b);

        int sum2 = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println(sum2);

        // MULTIPLICACIÓN
        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println(product);

        // MAX

        Optional<Integer> max = numbers.stream()
                .reduce(Integer::max);

        // MIN

        Optional<Integer> min = numbers.stream().reduce(Integer::min);

    }
}
