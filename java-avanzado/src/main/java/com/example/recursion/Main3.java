package com.example.recursion;

import java.time.Duration;
import java.time.Instant;

public class Main3 {

    /**
     * REVERSE string
     * @param args
     */
    public static void main(String[] args) {
        String str = "ABC";

        System.out.println("REVERSE ITERATIVO:");
        Instant start1 = Instant.now();
        String result1 = reverseIterative(str);
        Instant finish1 = Instant.now();
        long timeElapsed1 = Duration.between(start1, finish1).toNanos();
        System.out.println("Tiempo ejecución: " + timeElapsed1);
        System.out.println("Resultado: " + result1);


        System.out.println("==========");

        System.out.println("REVERSE RECURSIVO:");
        Instant start2 = Instant.now();
        String result2 = reverseRecursive(str);
        Instant finish2 = Instant.now();
        long timeElapsed2 = Duration.between(start2, finish2).toNanos();
        System.out.println("Tiempo ejecución: " + timeElapsed2);
        System.out.println("Resultado: " + result2);

        System.out.println("==========");



        System.out.println("REVERSE RECURSIVO TAIL:");
        Instant start3 = Instant.now();
        String result3 = reverseTail(str, "");
        Instant finish3 = Instant.now();
        long timeElapsed3 = Duration.between(start3, finish3).toNanos();
        System.out.println("Tiempo ejecución: " + timeElapsed3);
        System.out.println("Resultado: " + result3);
        System.out.println("==========");


    }

    /*
     reverseRecursive("ABC")
     reverseRecursive("BC") + 'A'
     (reverseRecursive("C") + 'B') + 'A'
     ("C" + 'B') + 'A'
     "CB" + 'A'
     "CBA"
     */
    public static String reverseRecursive(String texto) {
        if (texto.isEmpty())
            return texto;
        return reverseRecursive(texto.substring(1)) + texto.charAt(0);
    }

    /*
     reverseTail("ABC", "")
     reverseTail("BC", "A")
     reverseTail("C", "BA")
     reverseTail("", "CBA")
     "CBA"
     */
    public static String reverseTail(String texto, String acumulador) {
        if (texto.length() == 0)
            return acumulador;
        return reverseTail(texto.substring(1), texto.charAt(0) + acumulador);
    }


    public static String reverseIterative(String texto) {

        byte[] strArray = texto.getBytes();

        byte[] result = new byte[strArray.length];

        for (int i = 0; i < strArray.length; i++)
            result[i] = strArray[strArray.length - i - 1];

        return new String(result);
    }
}
