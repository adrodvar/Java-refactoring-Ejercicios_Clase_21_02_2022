package com.example.stream.opintermedias;

import java.util.ArrayList;
import java.util.List;

/**
 * Operación intermedia para filtrar datos
 */
public class Filter {

    public static void main(String[] args) {

        List<String> texts = new ArrayList<>();
        texts.add("ddd2");
        texts.add("aaa2");
        texts.add("bbb1");
        texts.add("aaa1");
        texts.add("bbb3");
        texts.add("ccc");
        texts.add("bbb2");
        texts.add("ddd1");

        texts.stream()
                .filter(s -> s.startsWith("a"))
                .forEach(System.out::println);

    }
}
