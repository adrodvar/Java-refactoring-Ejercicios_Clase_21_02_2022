package com.example.stream.examples.tasks;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 *  Working with primitive Streams
 */
public class Example8 {

    public static void main(String[] args) {
        IntStream.range(0, 10).forEach(System.out::println);

        LongStream infiniteStream = LongStream.iterate(1, el -> el + 1);
        infiniteStream.filter(el -> el % 2 == 0).forEach(System.out::println);
        infiniteStream.filter(el -> el % 2 == 0).limit(100).forEach(System.out::println);

    }
}
