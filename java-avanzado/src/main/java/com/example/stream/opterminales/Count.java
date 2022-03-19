package com.example.stream.opterminales;

import java.util.ArrayList;
import java.util.List;

/**
 * Count es una operación terminal que devuelve el
 * número de elementos en el flujo como un long.
 */
public class Count {

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

        long startsWithB = texts.stream()
                        .filter(s -> s.startsWith("b"))
                        .count();

        System.out.println(startsWithB);    // 3

    }
}
