package com.example.stream.creation;

import java.util.UUID;
import java.util.stream.Stream;

/**
 * Stream.generate() y Stream.iterate() permiten crear streams a partir de una lambda
 */
public class Generate {

    public static void main(String[] args) {

        // generate(): supplier
        Stream<String> uuidStream = Stream.generate(() -> UUID.randomUUID().toString());
        uuidStream.forEach(System.out::println);

        Stream.generate(Math::random)
                .limit(10)
                .forEach(System.out::println);

        // iterate(): function
        Stream.iterate(0, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);
    }
}
