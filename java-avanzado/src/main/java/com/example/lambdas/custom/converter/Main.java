package com.example.lambdas.custom.converter;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        String number = "123";
        String number2 = "456";

        Function<String, Integer> function = text -> Integer.valueOf(text);

        Converter<String, String, Integer> converter = (n1, n2) -> Integer.valueOf(n1) + Integer.valueOf(n2);

        Integer result = converter.convert(number, number2);
        System.out.println(result);
    }
}
