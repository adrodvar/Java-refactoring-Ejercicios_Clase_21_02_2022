package com.example.stream.opintermedias.map;

import java.util.Arrays;
import java.util.List;

public class Example3 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hola", "Buenos", "días", "chao");
        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .toList();

        System.out.println(wordLengths);

    }
}
