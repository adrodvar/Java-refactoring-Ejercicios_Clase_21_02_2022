package com.example.stream.creation;

import java.util.stream.Stream;

public class StreamEmpty {

    public static void main(String[] args) {

        Stream<String> names = Stream.empty();
        Stream<String> names2 = Stream.of("", "");

        Stream.concat(names, names2);
        System.out.println(names.count());
    }
}
