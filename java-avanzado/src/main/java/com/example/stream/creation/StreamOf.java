package com.example.stream.creation;

import java.util.stream.Stream;

public class StreamOf {

    public static void main(String[] args) {

        Stream<String> names = Stream.of("Ruperta", "Roberto", "Obdulio");

        names.map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

        names.map(String::toUpperCase).forEach(System.out::println);
    }
}
