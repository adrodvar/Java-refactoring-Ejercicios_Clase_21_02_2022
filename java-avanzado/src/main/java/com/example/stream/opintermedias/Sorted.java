package com.example.stream.opintermedias;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * operacion intermedia que devuelve una vista ordenada de un stream
 */
public class Sorted {

    public static void main(String[] args) {

        List<String> texts = new ArrayList<>();
        texts.add("ddd2");
        texts.add("aaa2");
        texts.add("bbb1");
        texts.add("aaaa1");
        texts.add("bbb3");
        texts.add("ccc");
        texts.add("bbb2");
        texts.add("ddd1");

        texts.stream()
                .filter(s -> s.startsWith("a"))
                .sorted()
                .forEach(System.out::println);

        // devuelve una vista ordenada, pero la colección inicial se mantiene como antes
        System.out.println(texts);

        texts.stream()
                .filter(s -> s.startsWith("a"))
                .sorted((s1, s2) -> s1.length() - s2.length())
                .forEach(System.out::println);

        texts.stream()
                .filter(s -> s.startsWith("a"))
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
