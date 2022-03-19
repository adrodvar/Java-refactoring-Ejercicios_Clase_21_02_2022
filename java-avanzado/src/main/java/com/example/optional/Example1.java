package com.example.optional;

import java.util.Optional;

public class Example1 {

    public static void main(String[] args) {

        Optional<String> optional = Optional.of("bam");

        optional.isPresent();           // true
        optional.get();                 // "bam"
        optional.orElse("fallback");    // "bam"

        optional.ifPresent((s) -> System.out.println(s.charAt(0)));     // "b"

        Optional<String> optional2 = Optional.ofNullable(null);
        String texto = optional2.orElse("Valor por defecto");
        System.out.println(texto);

    }
}
