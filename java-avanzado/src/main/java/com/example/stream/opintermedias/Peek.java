package com.example.stream.opintermedias;

import java.util.List;
import java.util.stream.Stream;

/**
 * peek() toma una lambda de tipo Consumer
 *
 * “This method exists mainly to support debugging,
 * where you want to see the elements as they flow past a certain point in a pipeline“.
 */
public class Peek {

    public static void main(String[] args) {

        List<String> items = Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .toList();

        System.out.println(items);

    }
}
