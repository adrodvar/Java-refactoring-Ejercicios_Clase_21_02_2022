package com.example.stream.opterminales.match;

import java.util.ArrayList;
import java.util.List;

/**
 * Se pueden utilizar varias operaciones de concordancia para comprobar
 * si un determinado predicado coincide con el flujo.
 *
 * Todas esas operaciones son terminales y devuelven un resultado booleano.
 */
public class Match {

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

        boolean anyStartsWithA =
                texts
                        .stream()
                        .anyMatch((s) -> s.startsWith("a"));

        System.out.println(anyStartsWithA);      // true

        boolean allStartsWithA =
                texts
                        .stream()
                        .allMatch((s) -> s.startsWith("a"));

        System.out.println(allStartsWithA);      // false

        boolean noneStartsWithZ =
                texts
                        .stream()
                        .noneMatch((s) -> s.startsWith("z"));

        System.out.println(noneStartsWithZ);      // true
    }
}
