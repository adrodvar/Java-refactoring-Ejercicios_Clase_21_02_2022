package com.example.stream.creation;

import java.util.stream.Stream;

public class StreamOfNullable {

    public static void main(String[] args) {

        // Ejemplo 1
        String homeValue = System.getenv("EXAMPLE");
        Stream<String> homeValueStream = homeValue == null ? Stream.empty() : Stream.of(homeValue);
        System.out.println(homeValueStream.count());

        // Ejemplo 2
        Stream<String> homeValueStream2 = Stream.ofNullable(homeValue);
        System.out.println(homeValueStream2.count());

        // Ejemplo 3
        Stream<String> values = Stream.of("config", "home", "user")
                .flatMap(key -> Stream.ofNullable(System.getProperty(key)));
    }
}
