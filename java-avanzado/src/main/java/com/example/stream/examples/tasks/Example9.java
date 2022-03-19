package com.example.stream.examples.tasks;

import java.util.Arrays;

/**
 * Creating Streams from Arrays
 */
public class Example9 {

    public static void main(String[] args) {

        String[] tags = {"java", "git", "lambdas", "machine-learning"};
        Arrays.stream(tags)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        Arrays.stream(tags, 1, 3)
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
