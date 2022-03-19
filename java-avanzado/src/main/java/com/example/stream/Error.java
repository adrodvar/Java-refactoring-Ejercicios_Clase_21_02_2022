package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Error {

    public static void main(String[] args) {

        // Error al intentar recorrer un stream dos veces.

        List<String> title = Arrays.asList("Name1", "Name2", "Name3", "Name4");
        Stream<String> s = title.stream();
        s.forEach(System.out::println);
        s.forEach(System.out::println); // da error

    }
}
